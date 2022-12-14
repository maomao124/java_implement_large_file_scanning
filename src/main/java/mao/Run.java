package mao;

import java.awt.*;
import java.io.File;
import java.util.*;
import java.util.List;

/**
 * Project name(项目名称)：java实现大文件扫描
 * Package(包名): mao
 * Class(类名): Run
 * Author(作者）: mao
 * Author QQ：1296193245
 * GitHub：https://github.com/maomao124/
 * Date(创建日期)： 2022/9/21
 * Time(创建时间)： 21:37
 * Version(版本): 1.0
 * Description(描述)： 无
 */

public class Run
{
    /**
     * 排行榜大小
     */
    public static int size;

    /**
     * 工作路径
     */
    public static String path;

    /**
     * id
     */
    private static int id = 0;

    /**
     * 列表
     */
    private static List<FilePath> list;

    /**
     * 是否是正常结束
     */
    private static volatile boolean isNormalEnd;

    /**
     * 获取工作路径下的所有文件，返回绝对路径
     *
     * @return {@link List}<{@link FilePath}>
     */
    public static List<FilePath> getFiles_AbsolutePath()
    {
        File file = new File("");
        String path = file.getAbsolutePath();
        list = new ArrayList<>();
        getFiles_AbsolutePath(path, list);
        return list;
    }

    /**
     * 得到文件绝对路径
     *
     * @param path 工作目录
     * @return {@link List}<{@link FilePath}>
     */
    public static List<FilePath> getFiles_AbsolutePath(String path)
    {
        list = new ArrayList<>();
        getFiles_AbsolutePath(path, list);
        return list;
    }

    /**
     * 得到文件绝对路径
     *
     * @param clientBase 工作路径
     * @param list       列表
     */
    private static void getFiles_AbsolutePath(String clientBase, List<FilePath> list)
    {
        File file = new File(clientBase);
        // 如果这个路径是文件夹
        if (file.isDirectory())
        {
            // 获取路径下的所有文件
            File[] files = file.listFiles();
            if (files != null)
            {
                for (File value : files)
                {
                    // 如果还是文件夹 递归获取里面的文件 文件夹
                    if (value.isDirectory())
                    {
                        //继续读取文件夹里面的所有文件
                        getFiles_AbsolutePath(value.getPath(), list);
                    }
                    else
                    {
                        id++;
                        addList(list, id, value);
                    }
                }
            }
        }
        else
        {
            id++;
            addList(list, id, file);
        }
    }

    /**
     * 添加到列表
     *
     * @param list 列表
     * @param id   id
     * @param file file
     */
    private static void addList(List<FilePath> list, int id, File file)
    {
        if (file == null)
        {
            return;
        }
        FilePath filePath = new FilePath();
        filePath.setId(id);
        filePath.setSize(file.length());
        filePath.setPath(file.getPath());
        list.add(filePath);
        System.out.print("\r扫描到" + id + "个文件");
    }

    /**
     * 排序
     *
     * @param list 列表
     */
    private static void sort(List<FilePath> list)
    {
        list.sort(new Comparator<FilePath>()
        {
            @Override
            public int compare(FilePath o1, FilePath o2)
            {
                //return Long.compare(o2.getSize(), o1.getSize());
                if (o1.getSize() > o2.getSize())
                {
                    return -1;
                }
                else if (o1.getSize() < o2.getSize())
                {
                    return 1;
                }
                else
                {
                    return 0;
                }
            }
        });
    }


    /**
     * 显示
     *
     * @param list 列表
     */
    private static void show(List<FilePath> list)
    {
        System.out.println();
        System.out.println();
        System.out.println("+------------------------------------------------------->");
        System.out.println("|  序号  |   大小    |    文件路径");
        System.out.println("+------------------------------------------------------->");
        int loop;
        //Math.min(list.size(), size);
        if (list.size() > size)
        {
            loop = size;
        }
        else
        {
            loop = list.size();
        }
        for (int i = 0; i < loop; i++)
        {
            FilePath filePath = list.get(i);
            if (filePath.getSize() > 1024 * 1024)
            {
                double MSize = ((double) filePath.getSize()) / 1024.0 / 1024.0;
                String format = String.format("|%4d\t|%8.3fMB\t|   %s", (i + 1), MSize, filePath.getPath());
                System.out.println(format);
            }
            else
            {
                double KSize = ((double) filePath.getSize()) / 1024.0;
                String format = String.format("|%4d\t|%8.3fKB\t|   %s", (i + 1), KSize, filePath.getPath());
                System.out.println(format);
            }
        }
        System.out.println("+------------------------------------------------------->");
    }

    /**
     * 验证路径是否正确
     *
     * @param path 路径
     * @return boolean
     */
    private static boolean verifyPath(String path)
    {
        try
        {
            File file = new File(path);
            if (!file.exists())
            {
                return false;
            }
            if (!file.isDirectory())
            {
                return false;
            }

            return true;
        }
        catch (Exception e)
        {
            return false;
        }
    }

    /**
     * 加载工作路径
     *
     * @param args 参数
     */
    private static void loadPath(String[] args)
    {
        try
        {
            String path = args[1];
            if (verifyPath(path))
            {
                Run.path = path;
            }
            else
            {
                Run.path = new File("").getAbsolutePath();
            }
        }
        catch (Exception e)
        {
            Run.path = new File("").getAbsolutePath();
        }
        System.out.println("工作路径：" + Run.path);
    }

    /**
     * 加载排行榜大小
     *
     * @param args 参数
     */
    private static void loadSize(String[] args)
    {
        try
        {
            int size = Integer.parseInt(args[0]);

            Run.size = size;
            System.out.println("排行最多显示" + size + "条");
        }
        catch (Exception e)
        {
            Run.size = 100;
            System.out.println("排行最多显示" + size + "条");
        }
    }

    /**
     * 计算总大小
     *
     * @param list 列表
     */
    private static void CalculateTotalSize(List<FilePath> list)
    {
        long totalSize = 0;
        for (FilePath filePath : list)
        {
            totalSize += filePath.getSize();
        }
        System.out.println();
        System.out.printf("所有文件加起来的总大小：%.4fMB\n", (((double) totalSize)) / 1024.0 / 1024.0);
    }

    public static void main(String[] args)
    {
        //System.out.println(Arrays.toString(args));

        Thread main = Thread.currentThread();

        System.out.println("第一个参数为排行榜最多显示的条数，第二个参数为工作目录");
        System.out.println();

        loadSize(args);

        loadPath(args);

        System.out.println();

        Runtime.getRuntime().addShutdownHook(new Thread(new Runnable()
        {
            @Override
            public void run()
            {
                if (isNormalEnd)
                {
                    return;
                }
                main.stop();
                System.out.println();
                System.out.println();
                System.out.println("强行停止扫描！！！ 正在统计...");
                sort(list);
                show(list);
                CalculateTotalSize(list);
            }
        }));

        List<FilePath> list = getFiles_AbsolutePath(path);
        System.out.println();

        sort(list);

        show(list);

        CalculateTotalSize(list);

        isNormalEnd = true;
    }
}

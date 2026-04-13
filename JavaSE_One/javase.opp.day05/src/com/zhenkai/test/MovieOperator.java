package com.zhenkai.test;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * @author Zhenkai
 * @date 2026/4/13 周一
 * @description 电影操作类
 **/
public class MovieOperator {
    private static final Scanner SCANNER = new Scanner(System.in);
    private final ArrayList<Movie> MOVIES = new ArrayList<>();

    public MovieOperator() {
        initMovies();
    }

    /**
     * 展示界面
     *
     */
    public void start() {
        while (true) {
            System.out.println("===========电影信息系统==========");
            System.out.println("您可以选择以下操作：1. 查看所有电影详情 2. 根据编号查询影片信息 3. 退出系统");
            System.out.print("请输入您的命令：");
            int choose = SCANNER.nextInt();
            switch (choose) {
                case 1:
                    // 查看所有电影，展示电影名称，导演，主演，评分
                    printAllMovie();
                    break;
                case 2:
                    // 根据 ID 查找并展示电影所有信息
                    System.out.println("请您输入您要查询电影的 ID");
                    searchById(SCANNER.nextInt());
                    break;
                case 3:
                    System.out.println("退出系统！");
                    return;
                default:
                    System.out.println("您输入的命令有误！请重新输入！\n");
            }
        }
    }

    /**
     * 展示所有电影信息
     *
     */
    private void printAllMovie() {
        System.out.println("------------全部电影信息如下----------");
        for (Movie movie : MOVIES) {
            System.out.println("电影名：" + movie.getMovieName());
            System.out.println("导演：" + movie.getDirector());
            System.out.println("主演：" + movie.getActor());
            System.out.println("评分：" + movie.getMovieScore());
            System.out.println("--------------------------");
        }
    }

    /**
     * 根据 ID 查询并展示该电影的全部信息
     *
     * @param id 要查询电影 ID
     */
    private void searchById(int id) {
        boolean found = false;

        for (Movie movie : MOVIES) {
            if (movie.getId() == id) {
                System.out.println("该电影全部信息如下：");
                System.out.println("电影名：" + movie.getMovieName());
                System.out.println("导演：" + movie.getDirector());
                System.out.println("主演：" + movie.getActor());
                System.out.println("评分：" + movie.getMovieScore());
                System.out.println("电影详情：" + movie.getInformation());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("未能找到该电影！请检查 ID 是否正确！");
        }

        SCANNER.close();

    }


    /**
     * 初始化数据
     *
     */
    private void initMovies() {
        Movie movie1 = new Movie("飞驰人生3", 9.5, 1, "韩寒", "沈腾，尹正", "剧情 | 喜剧 19.2 万人评");
        MOVIES.add(movie1);
        Movie movie2 = new Movie("惊蛰无声", 9.5, 2, "张艺谋", "易烊千玺，朱一龙", "谍战 | 犯罪 34.7 万人评");
        MOVIES.add(movie2);
        Movie movie3 = new Movie("熊出没年年有熊", 9.5, 3, "林汇达", "熊大，熊二，光头强", "动画 | 喜剧 5.4 万人评");
        MOVIES.add(movie3);
        Movie movie4 = new Movie("我的妈耶", 9.3, 4, "肖麓西", "马思纯，白客", "家庭 | 剧情 1.1 万人评");
        MOVIES.add(movie4);
    }
}



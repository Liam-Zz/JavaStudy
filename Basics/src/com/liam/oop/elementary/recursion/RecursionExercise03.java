package com.liam.oop.elementary.recursion;

public class RecursionExercise03 {
    public static void main(String[] args) {
        /*
            迷宫问题
                1.先创建迷宫,二维数组
                2.0 表示可以通行,1 表示障碍物

            如何求出最短路径?
         */
        int[][] map = new int[8][7];
        //将最上面和最下面的全部设置为 1
        for (int i = 0; i < 7; i++) {
            map[0][i] = 1;
            map[7][i] = 1;
        }
        //将最右面和最左面全部设置为 1
        for (int i = 0; i < 8; i++) {
            map[i][0] = 1;
            map[i][6] = 1;
        }
        //障碍物设置
        map[3][1] = 1;
        map[3][2] = 1;
        //测试回溯
        map[2][2] = 1;

        //输出地图
        System.out.println("地图");
        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

        //开始游戏
        C c = new C();
        c.findWay(map, 1, 1);
        System.out.println("\n路径说明");

        for (int i = 0; i < map.length; i++) {
            for (int j = 0; j < map[i].length; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }

    }
}

class C {
    /*
        使用递归回溯
     */
    //寻找路径方法,map 表示迷宫
    //老鼠初始位置(1,1),出口位置(6,5)
    //设置规则(0 表示可以走,1 表示障碍物,2 表示可以走 3,表示走过,打不通)
    //胜利规则,出口位置(6,5)为 2 时成功走出迷宫
    //策略: 下->右->上->左
    public boolean findWay(int[][] map, int i, int j) {
        if (map[6][5] == 2) {
            return true;
        } else {
            if (map[i][j] == 0) {
                //当前位置可以走,但没有走
                //设置理想值(2)
                map[i][j] = 2;
                //使用策略规定行走方向(策略可自定义)
                if (findWay(map, i + 1, j)) {//下
                    return true;
                } else if (findWay(map, i, j + 1)) {//右
                    return true;
                } else if (findWay(map, i - 1, j)) {//上
                    return true;
                } else if (findWay(map, i, j - 1)) {//左
                    return true;
                } else {
                    map[i][j] = 3;
                    return false;
                }

            } else {
                //可能值: 1,2,3
                return false;
            }
        }
    }
}


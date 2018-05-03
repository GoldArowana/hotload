package com.king.hotload;

/**
 * @author 金龙
 * @date 2018/5/3 at 下午6:09
 */
public class MsgHandler implements Runnable{

    @Override
    public void run() {
        while(true){
            BaseManager manager = ManagerFactory.getManager(ManagerFactory.MY_MANAGER);
            manager.logic();
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public static void main(String[] args) {
        new Thread(new MsgHandler()).start();
    }

}

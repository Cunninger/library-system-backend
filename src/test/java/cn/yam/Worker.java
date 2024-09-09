package cn.yam;

/**
 * 功能：
 * 日期：2024/9/8 下午8:50
 */
class Worker {
    public void doWork(Callback callback) {
        System.out.println("Doing ing ing");
        String result = "work is done ! ";

        callback.onCallback(result);
    }
}
package cn.yam;

/**
 * 功能：
 * 日期：2024/9/8 下午8:52
 */
class CallbackHandler implements Callback {

    @Override
    public void onCallback(String result) {
        System.out.println("Callback receive:"+result);
    }
}
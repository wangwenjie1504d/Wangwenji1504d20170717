package com.bawei.wangwenjie.wangwenji1504d20170717;

/**
 * 类描述：
 * 创建人：Administrator
 * 创建时间：2017/7/17/0017 10:11
 */

public class News {
    private  int imagepic;
   private String name;
   private int count;

    public News(int imagepic, String name, int count) {
        this.imagepic = imagepic;
        this.name = name;
        this.count = count;
    }

    public int getImagepic() {
        return imagepic;
    }

    public void setImagepic(int imagepic) {
        this.imagepic = imagepic;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

}

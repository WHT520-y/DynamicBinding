/**
 * java的动态绑定机制：当对象调用方法时，该方法会和该该对象的内存地址绑定（运行类型）绑定
 * 当调用对象属性时，没有动态绑定机制，在哪个类调用的属性就使用那个类的属性
 */
public class Text {
    public static void main(String[] args) {
        A a = new B();
        System.out.println(a.sum1());
        System.out.println(a.sum());
    }
}

public class B extends A{
    public int i = 20;
//    public int sum(){
//        return i + getI();
//    }

    public int getI(){
        return i;  // 20
    }

//    public int sum1(){
//        return i + 100;
//    }
}

public class A {
    public int i = 10;
    public int sum(){
        return i + getI();
    }

    public int getI(){
        return i;
    }

    public int sum1(){
        return i + 10;
    }
}

package com.javarush.task.task30.task3005;

import java.util.ArrayList;
import java.util.List;

/* 
Такие хитрые исключения!
*/
public class Solution {
    public static void main(String[] args) {
        checkAFlag(new D());
    }

    public static void checkAFlag(D d) {
        if (d!=null&&d.cs!=null&&d.cs.size()>0&&d.cs.get(0).bs!=null&&d.cs.get(0).bs.size()>0&&d.cs.get(0).bs.get(0).as!=null&&d.cs.get(0).bs.get(0).as.size()>0&&d.cs.get(0).bs.get(0).as.get(0).flag) {
            System.out.println("A's flag is true");
        }
        else {
            System.out.println("Oops!");
        }
    }
    /*В методе checkAFlag должна быть проверка, что d, пришедший в качестве параметра не null. Иначе вывод "Oops!".
            2. В методе checkAFlag должна быть проверка, что d.cs не null. Иначе вывод "Oops!".
            3. В методе checkAFlag должна быть проверка, что d.cs содержит хотя бы один элемент. Иначе вывод "Oops!".
            4. В методе checkAFlag должна быть проверка, что d.cs.get(0).bs не null. Иначе вывод "Oops!".
            5. В методе checkAFlag должна быть проверка, что d.cs.get(0).bs содержит хотя бы один элемент. Иначе вывод "Oops!".
            6. В методе checkAFlag должна быть проверка, что d.cs.get(0).bs.get(0).as не null. Иначе вывод "Oops!".
            7. В методе checkAFlag должна быть проверка, что d.cs.get(0).bs.get(0).as содержит хотя бы один элемент. Иначе вывод "Oops!".
            8. В методе checkAFlag должна быть проверка, что d.cs.get(0).bs.get(0).as.get(0).flag равен true. Иначе вывод "Oops!".*/

    static class A {
        boolean flag = true;
    }

    static class B {
        List<A> as = new ArrayList<>();

        {
            as.add(new A());
        }
    }

    static class C {
        List<B> bs = new ArrayList<>();

        {
            bs.add(new B());
        }
    }

    static class D {
        List<C> cs = new ArrayList<>();

        {
            cs.add(new C());
        }
    }
}

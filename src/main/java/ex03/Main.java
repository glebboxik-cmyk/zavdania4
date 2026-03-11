package ex03;

import ex02.View;

public class Main {
    public static void main(String[] args) {
        View v = new ViewableTable().getView();
        v.viewInit();
        v.viewShow();
    }
}

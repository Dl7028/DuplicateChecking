package mytest;

import org.junit.Test;
import yuki.DupCheckMain;

public class test {
    DupCheckMain d = new DupCheckMain();
    @Test
    public void test(){
        d.getRepetiveRate("D:/idea/myDemo/DuplicateChecking/src/main/file/orig.txt", "D:/idea/myDemo/DuplicateChecking/src/main/file/orig.txt");
    }
  /*  @Test
    public void test2(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig.txt", "DuplicateChecking/src/main/orig_0.8_del.txt");
    }
    @Test
    public void test3(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig_0.8_dis_1.txt", "DuplicateChecking/src/main/orig_0.8_add.txt");
    }
    @Test
    public void test4(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig_0.8_dis_10.txt", "DuplicateChecking/src/main/orig_0.8_add.txt");
    }
    @Test
    public void test5(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig_0.8_dis_15.txt", "DuplicateChecking/src/main/orig_0.8_add.txt");
    }
    @Test
    public void test6(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig.txt", "DuplicateChecking/src/main/orig_0.8_dis_1.txt");
    }
    @Test
    public void test7(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig.txt", "DuplicateChecking/src/main/orig_0.8_dis_10.txt");
    }
    @Test
    public void test8(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig.txt", "DuplicateChecking/src/main/orig_0.8_dis_15.txt");
    }
    @Test
    public void test9(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig_0.8_del.txt", "DuplicateChecking/src/main/orig_0.8_dis_10.txt");
    }
    @Test
    public void test10(){
        d.getRepetiveRate("DuplicateChecking/src/main/orig_0.8_add.txt", "DuplicateChecking/src/main/orig_0.8_dis_15.txt");
    }*/
}

package yuki;

import yuki.utils.GetSimiarityUtil;
import yuki.utils.IOUtil;

import java.io.File;
import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class DupCheckMain {


    public static void main(String[] args) {

        String result;
        result = IOUtil.textToString("src/main/orig.txt");
//        System.out.println("+++"+result);
        System.out.println("hello World");
        String str1 = "我是一个帅哥";
        String str2 = "帅哥是我";
        GetSimiarityUtil getSimiarityUtil = new GetSimiarityUtil(str1,str2);
        System.out.println(getSimiarityUtil.sim());
    }


    /**
     *
     * @param originalPath  原文件路径
     * @param plagiarizePath 抄袭文件路径
     * @return 返回结果
     */
    public Double getRepetiveRate(String originalPath,String plagiarizePath){
        Double reuslt = null;
        File originalFile = new File(originalPath);
        File plagiarizeFile = new File(plagiarizePath);
        String oriStr  = IOUtil.textToString(originalPath); //文本转为字符串
        String plagStr = IOUtil.textToString(plagiarizePath);
        if(!originalFile.exists()||!plagiarizeFile.exists()){  //文件不存在
            return null;
        }
        //余弦相似度计算

        return reuslt;
    }

}

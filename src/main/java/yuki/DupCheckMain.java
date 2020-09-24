package yuki;

import yuki.utils.IOUtil;

import java.io.File;

public class DupCheckMain {
    public static void main(String[] args) {

        String result;
        result = IOUtil.textToString("src/main/orig.txt");
//        System.out.println("+++"+result);
        System.out.println("hello World");

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

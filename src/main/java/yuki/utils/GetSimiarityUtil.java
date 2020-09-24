package yuki.utils;

import java.util.*;

/**
 * 余弦相似度计算工具类
 *
 */

public class GetSimiarityUtil {

    Map<String, int[]> vectorMap = new HashMap<String, int[]>();

    int[] tempArray = null;

 /*   public  GetSimiarityUtil(String string1, String string2) {

        for (Character character1 : string1.toCharArray()) {
            if (vectorMap.containsKey(character1)) {
                vectorMap.get(character1)[0]++;
            } else {
                tempArray = new int[2];
                tempArray[0] = 1;
                tempArray[1] = 0;
                vectorMap.put(character1, tempArray);
            }
        }
        for (Character character2 : string2.toCharArray()) {
            if (vectorMap.containsKey(character2)) {
                vectorMap.get(character2)[1]++;
            } else {
                tempArray = new int[2];
                tempArray[0] = 0;
                tempArray[1] = 1;
                vectorMap.put(character2, tempArray);
            }
        }
    }*/

    public  GetSimiarityUtil(String str1,String str2) {

        ArrayList<String> list1 = new ArrayList<>();


        for (String s : JieBaUtil.startParticiple(str1)) {
            if (vectorMap.containsKey(s)) {
                vectorMap.get(s)[0]++;
            } else {
                tempArray = new int[2];
                tempArray[0] = 1;
                tempArray[1] = 0;
                vectorMap.put(s, tempArray);
            }
        }
        for (String s2 : JieBaUtil.startParticiple(str2)) {
            if (vectorMap.containsKey(s2)) {
                vectorMap.get(s2)[1]++;
            } else {
                tempArray = new int[2];
                tempArray[0] = 0;
                tempArray[1] = 1;
                vectorMap.put(s2, tempArray);
            }
        }
    }

    // 求平方和
    private double squares(Map<String, int[]> paramMap) {
        double result1 = 0;
        double result2 = 0;
        Set<String> keySet = paramMap.keySet();
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            result1 += (temp[0] * temp[0]);
            result2 += (temp[1] * temp[1]);
        }
        return result1 * result2;
    }
    //平方相加
    private double sqrtMulti(Map<String, int[]> paramMap) {
        double result = 0;
        result = squares(paramMap);
        result = Math.sqrt(result);
        return result;
    }

    // 点乘法
    private double pointMulti(Map<String, int[]> paramMap) {
        double result = 0;
        Set<String> keySet = paramMap.keySet();
        for (String character : keySet) {
            int temp[] = paramMap.get(character);
            result += (temp[0] * temp[1]);
        }
        return result;
    }
    // 求余弦相似度
    public double sim() {
        double result = 0;
        result = pointMulti(vectorMap) / sqrtMulti(vectorMap);
        return result;
    }


    

}

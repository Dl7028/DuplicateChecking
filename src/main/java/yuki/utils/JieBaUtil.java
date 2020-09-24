package yuki.utils;

import com.huaban.analysis.jieba.JiebaSegmenter;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 结巴分词工具类
 */

public class JieBaUtil {

    /**
     * 开始调用结巴分词
     * @param text1 文本1
     */
    public static List<String> startParticiple(String text1){
        JiebaSegmenter segmenter = new JiebaSegmenter();

//        System.out.println(segmenter.sentenceProcess(text1));
        List<String> s = segmenter.sentenceProcess(text1);

      return s;

    }
}

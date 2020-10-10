
## 一、题目要求

设计一个论文查重算法，给出一个原文文件和一个在这份原文上经过了增删改的抄袭版论文的文件，在答案文件中输出其重复率。

- 原文示例：今天是星期天，天气晴，今天晚上我要去看电影。
- 抄袭版示例：今天是周天，天气晴朗，我晚上要去看电影。

要求输入输出采用文件输入输出，规范如下：

- 从**命令行参数**给出：论文原文的文件的**绝对路径**。
- 从**命令行参数**给出：抄袭版论文的文件的**绝对路径**。
- 从**命令行参数**给出：输出的答案文件的**绝对路径**。

## 二、项目实现

- 实现思路:

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924195714.png)

- 关键类：

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924231757.png)

```
 //算词频
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
```



- 核心算法：余弦相似度计算。

  >步骤
  >
  >1. 分词
  >
  >2. 列出所有词
  >
  >3. 使用Map记录词数
  >
  >4. 代入公式
  >
  >  ![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924231706.png)



# 三、性能

- 测试覆盖率截图

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924231444.png)

- 单元测试

  

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924232859.png)

- 类的内存消耗

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924212259.png)

- CPU Load

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924232726.png)

- 堆内存

![](https://gitee.com/yuki-r/blog-image/raw/master/img/20200924212520.png)




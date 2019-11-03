---
home: true
heroImage: /spark-logo-trademark.png

actionText: 快速上手 
actionLink: /docs/


footer: MIT Licensed | Copyright © 2018-present Evan You
---

::: warning 提示
各路英雄豪杰、武林盟主、绿林好汉：
    
你们好！
    
本站刚搭建不久，内容还在丰富中。若各路英雄有意参与本站建设、贡献翻译以及提出优化建议等，请与站长[联系](/about/)。
:::

<div class="features">
  <div class="feature">
    <h2>快速</h2>
    <h5>将工作负载运行速度提高100倍</h5>
    <p>Apache Spark使用最先进的DAG调度程序，查询优化器和物理执行引擎，为批处理数据和流数据提供了高性能。</p>
  </div>
  <div class="feature">
    <h2>易用</h2>
    <h5>使用Java，Scala，Python，R和SQL快速编写应用程序</h5>
    <p>Spark提供了80多个高级操作，可轻松构建并行应用程序。你可以从Scala、Python、R和SQL Shell交互使用它。</p>
  </div>
  <div class="feature">
    <h2>通用</h2>
    <h5>结合使用SQL，流式计算和复杂的分析</h5>
    <p>Spark为SQL和DataFrames、用于机器学习的MLlib、GraphX和Spark Streaming的提供了强大的库。你可以在同一应用程序中无缝组合这些库。</p>
  </div>
</div>

### 就像1、2、3一样简单

```bash
# 1、启动Spark Shell
./bin/spark-shell

# 2、读取文件
scala> val textFile = spark.read.textFile("README.md")
textFile: org.apache.spark.sql.Dataset[String] = [value: string]

# 3、统计文件中“Spark”出现的次数
scala> textFile.filter(line => line.contains("Spark")).count()
res3: Long = 15
```
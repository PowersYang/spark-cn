---
home: true
heroImage: /spark-logo-trademark.png

actionText: Getting Started
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
    <h2>Speed</h2>
    <h5>Run workloads 100x faster</h5>
    <p>Apache Spark achieves high performance for both batch and streaming data, using a state-of-the-art DAG scheduler, a query optimizer, and a physical execution engine.</p>
  </div>
  <div class="feature">
    <h2>Ease of Use</h2>
    <h5>Write applications quickly in Java, Scala, Python, R, and SQL</h5>
    <p>Spark offers over 80 high-level operators that make it easy to build parallel apps. And you can use it interactively from the Scala, Python, R, and SQL shells.</p>
  </div>
  <div class="feature">
    <h2>Generality</h2>
    <h5>Combine SQL, streaming, and complex analytics</h5>
    <p>Spark powers a stack of libraries including SQL and DataFrames, MLlib for machine learning, GraphX, and Spark Streaming. You can combine these libraries seamlessly in the same application.</p>
  </div>
</div>

### Just like 1、2、3

```bash
# 1、Start Spark Shell
./bin/spark-shell

# 2、Read the File
scala> val textFile = spark.read.textFile("README.md")
textFile: org.apache.spark.sql.Dataset[String] = [value: string]

# 3、Count the number of times "spark" appears in the file
scala> textFile.filter(line => line.contains("Spark")).count()
res3: Long = 15
```
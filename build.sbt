name := "spark-streaming-scribe"

version := "1.0"

libraryDependencies ++= Seq(
  "org.slf4j" % "slf4j-log4j12" % "1.7.7",
  "org.apache.thrift" % "libfb303" % "0.9.1",
  "org.apache.thrift" % "libthrift" % "0.9.1",
  "org.apache.spark" % "spark-core_2.10" % "1.1.0" % "provided",
  "org.apache.spark" % "spark-streaming_2.10" % "1.1.0" % "provided",
  "org.apache.zookeeper" % "zookeeper" % "3.4.6"
)
    
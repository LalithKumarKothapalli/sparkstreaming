name := "TwitterPopularTags"

version := "1.0"

mergeStrategy in assembly <<= (mergeStrategy in assembly) { (old) =>
   {
    case PathList("META-INF", xs @ _*) => MergeStrategy.discard
    case x => MergeStrategy.first
   }
}

libraryDependencies += "org.apache.spark" % "spark-streaming-twitter_2.10" % "1.4.1"
libraryDependencies += "org.twitter4j" % "twitter4j" % "2.2.1"
libraryDependencies += "org.apache.spark" % "spark-core_2.10" % "1.4.0"
libraryDependencies += "org.apache.spark" % "spark-streaming_2.10" % "1.4.0"

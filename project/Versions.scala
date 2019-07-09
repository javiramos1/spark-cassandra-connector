import scala.util.Properties

object Versions {
  lazy val scalaVersion = "2.11.12"

  /* For `scalaBinaryVersion.value outside an sbt task. */
  lazy val scalaBinary = scalaVersion.dropRight(2)

  val CommonsExec     = "1.3"
  val CommonsIO       = "2.4"
  val CommonsLang3    = "3.3.2"

  val DseJavaDriver = "1.8.1"
  //val DseJavaDriver   = "2.0.1" //TODO MAJOR CHANGE HERE

  val Netty           = "4.0.33.Final"
  val ScalaCheck      = "1.14.0"
  val ScalaTest       = "3.0.3"
  val Slf4j           = "1.6.1"//1.7.7"

  // Spark version can be specified as:
  // - regular version which is present in some public Maven repository
  // - a release tag in https://github.com/apache/spark
  // - one of main branches, like master or branch-x.y, followed by "-SNAPSHOT" suffix
  // The last two cases trigger the build to clone the given revision of Spark from GitHub, build it
  // and install in a local Maven repository. This is all done automatically, however it will work
  // only on Unix/OSX operating system. Windows users have to build and install Spark manually if the
  // desired version is not yet published into a public Maven repository.
  val ApacheSpark           = "2.4.3"
  val SparkJetty      = "8.1.14.v20131031"

  val doNotInstallSpark = true

  /*
  val status = (versionInReapply: String, binaryInReapply: String) =>
    println(s"""
               |  Scala: $versionInReapply
               |  Scala Binary: $binaryInReapply
               |  Java: target=$JDK user=${Properties.javaVersion}
               |  Cassandra version for testing: ${Testing.cassandraTestVersion} [can be overridden by specifying '-Dtest.cassandra.version=<version>']
        """.stripMargin)

   */
}

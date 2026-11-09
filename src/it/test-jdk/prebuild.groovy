// The JDK running this build, under a version no real toolchain declares.
// write() rather than .text =: a script whose last value is not true or null
// fails the build.
new File(basedir, 'toolchains.xml').write("""<?xml version="1.0" encoding="UTF-8"?>
<toolchains>
  <toolchain>
    <type>jdk</type>
    <provides>
      <version>imgn-it</version>
    </provides>
    <configuration>
      <jdkHome>${System.getProperty('java.home')}</jdkHome>
    </configuration>
  </toolchain>
</toolchains>
""")

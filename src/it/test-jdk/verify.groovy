def log = new File(basedir, 'build.log').text
assert log.contains('Toolchain in maven-surefire-plugin: JDK[')
assert log.contains('Tests run: 1, Failures: 0')

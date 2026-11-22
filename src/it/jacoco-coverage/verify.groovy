assert new File(basedir, 'target/jacoco.exec').isFile()
assert new File(basedir, 'target/site/jacoco/jacoco.xml').text.contains('name="be/imgn/it/Greeter"')

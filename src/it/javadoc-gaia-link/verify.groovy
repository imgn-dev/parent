def page = new File(basedir, 'target/reports/apidocs/be.imgn.it/be/imgn/it/Reader.html').text
assert page.contains('href="https://imgn-dev.github.io/gaia/api/0.1.2/be.imgn.gaia.core/be/imgn/gaia/core/io/ByteSource.html"')

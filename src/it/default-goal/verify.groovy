def log = new File(basedir, 'build.log').text
assert log.contains('--- clean:')
assert log.contains('--- dependency:') && log.contains(':analyze-only (analyze-dependencies)')
assert !log.contains('--- install:')

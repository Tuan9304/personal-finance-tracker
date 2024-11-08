#!/usr/bin/env python3
import subprocess
import sys

def main():
    if sys.platform == 'win32':
        cmd = (r'linter\run_checkstyle.bat', *sys.argv[1:])
    else:
        cmd = ('linter/run_checkstyle.sh', *sys.argv[1:])
    return subprocess.call(cmd)

if __name__ == '__main__':
    exit(main())


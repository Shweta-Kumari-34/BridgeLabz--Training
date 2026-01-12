
    public int FirstBadVersion(int n) {
        long first = 1;
        long last = n;

        while (first <= last) {
            long mid = (first + last) / 2;

            if (isBadVersion((int) mid)) {
                last = mid - 1;
            } else {
                first = mid + 1;
            }
        }
        return (int) first;
    }   
    }

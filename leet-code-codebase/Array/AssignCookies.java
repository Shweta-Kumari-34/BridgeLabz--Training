import java.util.*;

class AssignCookies {
    public int findContentChildren(int[] g, int[] s) {
        // Sort greed factors and cookie sizes
        Arrays.sort(g);
        Arrays.sort(s);

        int i = 0; // pointer for children
        int j = 0; // pointer for cookies

        // Traverse both arrays
        while (i < g.length && j < s.length) {
            if (s[j] >= g[i]) {
                // Cookie satisfies the child's greed
                i++; // move to next child
            }
            // Move to next cookie
            j++;
        }

        return i; // number of content children
    }
}

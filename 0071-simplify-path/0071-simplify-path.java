import java.util.Stack;

public class Solution {
    public String simplifyPath(String path) {
        Stack<String> stack = new Stack<>();
        String[] components = path.split("/");
        for (String component : components) {
            if (component.equals("..")) {
                if (!stack.isEmpty()) {
                    stack.pop();
                }
            } else if (!component.isEmpty() && !component.equals(".")) {
                stack.push(component);
            }
        }
        StringBuilder result = new StringBuilder();
        for (String dir : stack) {
            result.append("/").append(dir);
        }
        return result.length() > 0 ? result.toString() : "/";
    }

    public static void main(String[] args) {
        Solution sp = new Solution();
        System.out.println(sp.simplifyPath("/home/"));
        System.out.println(sp.simplifyPath("/home//foo/"));
        System.out.println(sp.simplifyPath("/home/user/Documents/../Pictures"));
        System.out.println(sp.simplifyPath("/../"));
        System.out.println(sp.simplifyPath("/.../a/../b/c/../d/./"));
    }
}

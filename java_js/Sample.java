import org.graalvm.polyglot.*;

public class Sample {
    public static void main(String[] args) {
	Context ctx = Context.create();
	String text = "hello";
	// ctx.eval("js", "const text = '" + text + "'");
	Value bindings = ctx.getBindings("js");
	bindings.putMember("text", text);
	ctx.eval("js", "console.log(text)");
    }
}

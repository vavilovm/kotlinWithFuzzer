// FILE: BoxFunKt.java

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

class BoxFunKt {
   @NotNull
   public static final String box() {
      ProjectJsonFormatter formatter = new ProjectJsonFormatter();
      return formatter.format(new Project()) != null ? "OK" : "fail";
   }
}

// FILE: kt2390.kt


class JsonObject() {
}

class JsonArray() {
}

public interface Formatter<in IN: Any, out OUT: Any> {
    public fun format(source: IN?): OUT
}

public interface MultiFormatter <in IN: Any, out OUT: Any> {
    public fun format(source: Collection<IN>): OUT
}

public class Project() {
}

public interface JsonFormatter<in IN: Any>: Formatter<IN, JsonObject>, MultiFormatter<IN, JsonArray> {
    public override fun format(source: Collection<IN>): JsonArray {
        return JsonArray();
    }
}

public class ProjectJsonFormatter(): JsonFormatter<Project> {
   public override fun format(source: Project?): JsonObject {
        return JsonObject()
    }
}



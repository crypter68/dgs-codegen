package kotlin2.projectionWithPrimitiveAndArgs.expected.types

import com.netflix.graphql.dgs.codegen.GraphQLInput
import kotlin.String

public class I(
  public val arg: String? = default("arg"),
) : GraphQLInput()

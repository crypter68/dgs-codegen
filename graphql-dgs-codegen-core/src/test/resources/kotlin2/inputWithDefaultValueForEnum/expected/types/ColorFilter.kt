package kotlin2.inputWithDefaultValueForEnum.expected.types

import com.netflix.graphql.dgs.codegen.GraphQLInput

public class ColorFilter(
  public val color: Color? = default("color"),
) : GraphQLInput()

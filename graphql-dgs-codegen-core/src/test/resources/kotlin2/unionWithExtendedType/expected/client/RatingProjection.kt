package kotlin2.unionWithExtendedType.expected.client

import com.netflix.graphql.dgs.codegen.GraphQLProjection

public class RatingProjection : GraphQLProjection() {
  public val stars: RatingProjection
    get() {
      field("stars")
      return this
    }
}

package kotlin2.interfaceClassWithNonNullableFields.expected.client

import com.netflix.graphql.dgs.codegen.GraphQLProjection

public class PersonProjection : GraphQLProjection() {
  public val firstname: PersonProjection
    get() {
      field("firstname")
      return this
    }

  public val lastname: PersonProjection
    get() {
      field("lastname")
      return this
    }

  public fun onEmployee(_projection: EmployeeProjection.() -> EmployeeProjection):
      PersonProjection {
    project("... on Employee", EmployeeProjection(), _projection)
    return this
  }
}

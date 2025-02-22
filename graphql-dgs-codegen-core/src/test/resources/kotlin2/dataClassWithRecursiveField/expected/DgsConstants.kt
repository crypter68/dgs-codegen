package kotlin2.dataClassWithRecursiveField.expected

import kotlin.String

public object DgsConstants {
  public const val QUERY_TYPE: String = "Query"

  public object QUERY {
    public const val TYPE_NAME: String = "Query"

    public const val People: String = "people"
  }

  public object PERSON {
    public const val TYPE_NAME: String = "Person"

    public const val Firstname: String = "firstname"

    public const val Lastname: String = "lastname"

    public const val Friends: String = "friends"
  }
}

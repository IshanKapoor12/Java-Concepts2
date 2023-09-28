// This is a record not a class.
// Its purpose is to replace the boilerplate code of the POJO.
// It is more restrictive than POJO.
// Also called as Plain Data Carriers.
// It is a special class that contains data that is not meant to be altered.
// It seeks to achieve immutability for the data in its members.
// It contains only the most fundamental methods such as constructors and accessors.

public record newStudent(String id, String name, String dateOfBirth, String classList) {
}

// The part in the () is called the record header.
// It consists of record components (a comma separated list of components)

// For each component in the header, Java generates:
// 1. A field with the same name and declared type as the record argument.
// 2. The field is declared private and final.
// 3. The field is sometimes referred to as component field.
// 4. A toString() method that prints out each attribute in a formatted string.
// 5. A public accessor method:
// The method has the same name and type of the component , but it doesn't have any kind of special prefix (no get, or is)
// Eg: The accessor method for id is id().

// Cannot use setters for Record so that makes the data unchangeable by the user which is what we want.
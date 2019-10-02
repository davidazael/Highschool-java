///////////////////////////////////////////////////////////////////////////
//
// Java5107	Write a program that will check a text in a markup language
//			(such as HTML or XML) to see if it is well-formed.
//
//			The list text is a list of String. Some strings are
//			markup tags, such as "<TT>" or "</TT>", and other strings
//			are ignored for checking purposes.
//
//			You may assume that any string that begins with < is a tag.
//			Every opening tag should be matched by a closing tag,
//			indicated by /.
//
//			We will assume that tag pairs may be nested to a
//			depth up to 100.
//
//			If a list is well-formed, return true;
//			If there is a tag out of place,
//				print a message with the offending tag,
//				its numeric position in the list (starting with 0),
//				the correct tag that was expected,
//				and return false.
//
//
///////////////////////////////////////////////////////////////////////////
//
//   DATA
/*

<HTML>
<HEAD>
<TITLE>HTML Checker File</TITLE>
</HEAD>
<BODY>
<H2>One Liner</H2>
If we aren't supposed to eat animals, why are they made with meat?
</BODY>
</HTML>

*/
//   SAMPLE OUTPUT:
/*

Markup Language Test
PASS

*/
//
///////////////////////////////////////////////////////////////////////////




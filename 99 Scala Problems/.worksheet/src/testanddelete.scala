import listsPackage.lists._

object testanddelete {;import org.scalaide.worksheet.runtime.library.WorksheetSupport._; def main(args: Array[String])=$execute{;$skip(125); 
  val randomSymbolSet = randomPermute(List('a, 'b, 'c, 'd, 'e, 'f)).toSet;System.out.println("""randomSymbolSet  : scala.collection.immutable.Set[Symbol] = """ + $show(randomSymbolSet ));$skip(58); 
  
  val aaa = List('a, 'b, 'c, 'd, 'e, 'f).toSet.subsets;System.out.println("""aaa  : Iterator[scala.collection.immutable.Set[Symbol]] = """ + $show(aaa ));$skip(32); val res$0 = 
  aaa.contains(randomSymbolSet);System.out.println("""res0: Boolean = """ + $show(res$0))}
  
}
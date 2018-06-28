val s1 = (1 +: (2 +: (3 +: (4 +: (5 +: Nil)))))
val l = (1 :: (2 :: (3 :: (4 :: (5 :: Nil)))))
s1 == l
s1 eq l
val s2 = (("one",1) +: (("two",2) +: (("three",3) +: Nil)))
val m = Map(s2 : _*)

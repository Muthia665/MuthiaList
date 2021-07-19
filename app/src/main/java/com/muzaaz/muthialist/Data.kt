package com.muzaaz.muthialist

//diganti
object Data {
    private val names = arrayOf(
        "Tyrannosaurus",
        "Velociraptor",
        "Spinosaurus",
        "Brachiosaurus",
        "Diplodocus",
        "Allosaurus",
        "Carnotaurus",
        "Brontosaurus",
        "Theropods",
        "Giganotosaurus"
    )


    private val details = arrayOf(
        "Tyrannosaurus is a genus of coelurosaurian theropod dinosaur. The species Tyrannosaurus rex, often called T.rex or colloquially T-Rex,is one of the most well-represented of the large theropods.",
        "Velociraptor is a genus of dromaeosaurid theropod dinosaur that lived approximately 75 to 71 million years ago during the latter part of the Cretaceous Period.",
        "Spinosaurus is a genus of theropod dinosaur that lived in what now is North Africa, during the upper Albian to upper Turonian stages of the Cretaceous period, about 112 to 93.5 million years ago.",
        "Brachiosaurus is a genus of sauropod dinosaur that lived in North America during the Late Jurassic, about 154–153 million years ago.It was first described by American paleontologist Elmer S.",
        "Diplodocus is a genus of diplodocid sauropod dinosaurs whose fossils were first discovered in 1877 by S. W. Williston.",
        "Allosaurus is a genus of carnivorous theropod dinosaur that lived 155 to 145 million years ago during the late Jurassic period. The name ALLOSAURUS means DIFFERENT LIZARD alluding to its unique concave vertebrae.",
        "Carnotaurus is a genus of large theropod dinosaur that lived in South America during the Late Cretaceous period, between about 72 and 69.9 million years ago.The only species is Carnotaurus sastrei.",
        "Brontosaurus is a genus of gigantic quadruped sauropod dinosaurs.",
        "Theropoda or theropods are a dinosaur suborder that is characterized by hollow bones and three-toed limbs. They are generally classed as a group of saurischian dinosaurs. Theropods were ancestrally carnivorous, although a number of theropod groups evolved to become herbivores, omnivores, piscivores, and insectivores.",
        "Giganotosaurus is a genus of theropod dinosaur that lived in what is now Argentina, during the early Cenomanian age of the Late Cretaceous period, approximately 98 to 97 million years ago. The holotype specimen was discovered in the Candeleros Formation of Patagonia in 1993, and is almost 70% complete."
    )

    private val photos = intArrayOf(
        R.drawable.tyrannosaurus,
        R.drawable.velociraptor,
        R.drawable.spinosaurus,
        R.drawable.brachiosaurus,
        R.drawable.diplodocus,
        R.drawable.allosaurus,
        R.drawable.carnotaurus,
        R.drawable.brontosaurus,
        R.drawable.theropods,
        R.drawable.giganotosaurus
    )

    val listData: ArrayList<Model>
        get() {
            val list = arrayListOf<Model>()
            for (position in names.indices) {
                val model = Model()
                model.name = names[position]
                model.detail = details[position]
                model.photo = photos[position]
                list.add(model)
            }
            return list
        }
}

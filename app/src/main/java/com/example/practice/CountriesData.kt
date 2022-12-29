package com.example.practice

object CountriesData {
    private val countryName = arrayOf(
        "Afghanistan",
        "Åland Islands",
        "Albania",
        "Algeria",
        "American Samoa",
        "Andorra",
        "Angola",
        "Anguilla",
        "Antarctica",
        "Antigua and Barbuda",
        "Argentina",
        "Armenia",
        "Aruba",
        "Australia",
        "Austria"

    )

    private val countryDetail = arrayOf(
        "Afghanistan, officially the Islamic Republic of Afghanistan, is a mountainous, landlocked country in South-Central Asia at an important geopolitical location, it connects the Middle East with Central Asia and the Indian subcontinent." +
        "It is bordered by Iran, Pakistan, Tajikistan, Turkmenistan, and Uzbekistan, it has a short border in the Wakhan Corridor panhandle with Xinjiang, an autonomous region of China."+
        "With a surface area of 652,000 km², the country is somewhat larger than the Iberian Peninsula, or slightly smaller than U.S. state of Texas.",

        "Åland Islands, Swedish Åland Skärgård, Finnish Ahvenanmaa, archipelago constituting Åland (Ahvenanmaa) autonomous territory, southwestern Finland. The islands lie at the entrance to the Gulf of Bothnia, 25 miles (40 km) east of the Swedish coast, at the eastern edge of the Åland Sea."+
        "The archipelago has a land area of 599 square miles (1,551 square km) and consists of about 35 inhabited islands, 6,500 uninhabited islands, and many rocky reefs.",

        "Albania, country in southern Europe, located in the western part of the Balkan Peninsula on the Strait of Otranto, the southern entrance to the Adriatic Sea. The capital city is Tirana (Tiranë)." +
        "Albanians refer to themselves as shqiptarë—often taken to mean “sons of eagles,” though it may well refer to “those associated with the shqip (i.e., Albanian) language”—and to their country as Shqipëria.",

        "Algeria, large, predominantly Muslim country of North Africa. From the Mediterranean coast, along which most of its people live, Algeria extends southward deep into the heart of the Sahara, a forbidding desert where Earth’s hottest surface temperatures have been recorded and which constitutes more than four-fifths of the country’s area. The Sahara and its extreme climate dominate the country.",

        "American Samoa, officially Territory of American Samoa, unincorporated territory of the United States consisting of the eastern part of the Samoan archipelago, located in the south-central Pacific Ocean. It lies about 1,600 miles (2,600 km) northeast of New Zealand and 2,200 miles (3,500 km) southwest of the U.S. state of Hawaii."+
        "The territory, which is part of Polynesia, includes the six Samoan islands east of the 171° W meridian. Samoa (formerly Western Samoa), its closest neighbour and a self-governing country, consists of the nine Samoan islands west of the meridian.",

        "Andorra, small independent European coprincipality situated among the southern peaks of the Pyrenees Mountains and bounded by France to the north and east and by Spain to the south and west. It is one of the smallest states in Europe. The capital is Andorra la Vella."+
        "Andorra consists of a cluster of mountain valleys whose streams unite to form the Valira River. Two of these streams, the Madriu and the Perafita, flow into the Madriu-Perafita-Claror valley, which occupies about one-tenth of Andorra’s land area and is characterized by glacial landscapes, steep valleys, and open pastures.",

        "Angola, country located in southwestern Africa. A large country, Angola takes in a broad variety of landscapes, including the semidesert Atlantic littoral bordering Namibia’s “Skeleton Coast,” the sparsely populated rainforest interior, the rugged highlands of the south, the Cabinda exclave in the north, and the densely settled towns and cities of the northern coast and north-central river valleys.",

        "Anguilla, island in the eastern Caribbean Sea, a British overseas territory. It is the most northerly of the Leeward Islands in the Lesser Antilles and lies about 12 miles (19 km) north of the island of Saint Martin and 60 miles (100 km) northwest of Saint Kitts. The Valley is the principal town and the administrative centre of the island. Noted for its easygoing atmosphere and magnificent beaches and waters, Anguilla is a popular tourist destination."+
        "Area 35 square miles (91 square km). Pop. (2006 est.) 14,254.",

        "Antarctica, the world’s southernmost and fifth largest continent. Its landmass is almost wholly covered by a vast ice sheet."+
        "Often described as a continent of superlatives, Antarctica is not only the world’s southernmost continent. It is also the world’s highest, driest, windiest, coldest, and iciest continent. Antarctica is about 5.5 million square miles (14.2 million square km) in size, and thick ice covers about 98 percent of the land. The continent is divided into East Antarctica (which is largely composed of a high ice-covered plateau) and West Antarctica (which is largely an ice sheet covering an archipelago of mountainous islands).",

        "Antigua and Barbuda, islands that form an independent state in the Lesser Antilles in the eastern Caribbean Sea, at the southern end of the Leeward Islands chain. There is one dependency, the small island of Redonda. The capital is St. John’s, on Antigua.",

        "Argentina, country of South America, covering most of the southern portion of the continent. The world’s eighth largest country, Argentina occupies an area more extensive than Mexico and the U.S. state of Texas combined. It encompasses immense plains, deserts, tundra, and forests, as well as tall mountains, rivers, and thousands of miles of ocean shoreline. Argentina also claims a portion of Antarctica, as well as several islands in the South Atlantic, including the British-ruled Falkland Islands (Islas Malvinas)."+
        "Argentina has long played an important role in the continent’s history.",

        "Armenia, country of Transcaucasia, lying just south of the great mountain range of the Caucasus and fronting the northwestern extremity of Asia. To the north and east Armenia is bounded by Georgia and Azerbaijan, while its neighbours to the southeast and west are, respectively, Iran and Turkey. Naxçıvan, an exclave of Azerbaijan, borders Armenia to the southwest. The capital is Yerevan (Erevan)."+
        "Modern Armenia comprises only a small portion of ancient Armenia, one of the world’s oldest centres of civilization. At its height, Armenia extended from the south-central Black Sea coast to the Caspian Sea and from the Mediterranean Sea to Lake Urmia in present-day Iran.",

        "Aruba, island lying southwest of the Lesser Antilles in the Caribbean Sea, some 50 miles (80 km) northwest of Curaçao and 18 miles (29 km) north of the Venezuelan peninsula of Paraguaná."+
        "Aruba was formerly a part of the Netherlands Antilles. In 1986 it became a separate self-governing part of the Kingdom of the Netherlands. Tourists flock to Aruba, attracted by its white-sand beaches in the south and west, rugged coastline in the northeast, and desert environment in the interior. The capital is Oranjestad, which also is the main port.",

        "Australia, the smallest continent and one of the largest countries on Earth, lying between the Pacific and Indian oceans in the Southern Hemisphere. Australia’s capital is Canberra, located in the southeast between the larger and more important economic and cultural centres of Sydney and Melbourne. The Australian mainland extends from west to east for nearly 2,500 miles (4,000 km) and from Cape York Peninsula in the northeast to Wilsons Promontory in the southeast for nearly 2,000 miles (3,200 km).",

        "Austria, largely mountainous landlocked country of south-central Europe. Together with Switzerland, it forms what has been characterized as the neutral core of Europe, notwithstanding Austria’s full membership since 1995 in the supranational European Union (EU)."+
        "A great part of Austria’s prominence can be attributed to its geographic position. It is at the centre of European traffic between east and west along the great Danubian trade route and between north and south through the magnificent Alpine passes, thus embedding the country within a variety of political and economic systems."

    )

    private val countryImage = intArrayOf(
        R.drawable.afghanistan,
        R.drawable.aland,
        R.drawable.albania,
        R.drawable.algeria,
        R.drawable.american_samoa,
        R.drawable.andorra,
        R.drawable.angola,
        R.drawable.anguilla,
        R.drawable.antarctica,
        R.drawable.antigua,
        R.drawable.argentina,
        R.drawable.armenia,
        R.drawable.aruba,
        R.drawable.australia,
        R.drawable.austria,
    )

    val listData : ArrayList<Countries>
    get(){
        val list = arrayListOf<Countries>()
        for (position in countryName.indices){
            val countries = Countries()
            countries.name = countryName[position]
            countries.detail = countryDetail[position]
            countries.photo = countryImage[position]
            list.add(countries)
        }
        return list
    }

}
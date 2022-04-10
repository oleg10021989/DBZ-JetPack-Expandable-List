package com.example.expandablelist.cards

//var title: String,
//var body: String,
//var section: I"


class PersonRepository {
    fun getAllData(): List<Person> {
        return listOf(
            Person(
                id = 0,
                title = "Goku",
                body = "Son Goku, born Kakarot, is a male Saiyan and the main protagonist of the Dragon Ball metaseries created by Akira Toriyama. Fandom\n" +
                        "Height (m): 1.75\n" +
                        "Spouse: Chi-Chi\n" +
                        "Created by: Akira Toriyama\n" +
                        "Family: Grandpa Gohan (adoptive grandfather); Bardock (father); Gine (mother); Raditz (elder brother)\n" +
                        "Voiced by: Masako Nozawa (Toei Animation), MORE\n" +
                        "Children: Gohan, Goten",
                section = "Saiyan",
                Image ="https://dragonball.guru/wp-content/uploads/2021/01/goku-dragon-ball-guru.jpg"
            ),
            Person(
                id = 1,
                title = "Vegeta",
                body = "Vegeta is the prince of the fallen Saiyan race. He is the eldest son of King Vegeta, the older brother of Tarble, the husband of Bulma, the father of Trunks and Bulla, and the ancestor of Vegeta Jr. Fandom\n" +
                        "Height (m): 1.64\n" +
                        "Spouse: Bulma\n" +
                        "Family: Vegeta III (father); Tarble (younger brother)\n" +
                        "Title: Prince of Saiyans\n" +
                        "Voiced by: Ryō Horikawa (Toei Animation), Christopher Sabat (Funimation), Laura Bailey (Funimation)\n" +
                        "Children: Trunks, Bulla",
                section = "Saiyan",
                Image ="!https://static1.cbrimages.com/wordpress/wp-content/uploads/2021/08/vegeta-dragon-ball-super-frown.jpg?q=50&fit=crop&w=767&h=450&dpr=1.5"
            ),
            Person(
                id = 2,
                title = "Gohan",
                body = "Gohan is the elder son of the series' primary protagonist Goku and his wife Chi-Chi, the older brother of Goten, the husband of Videl and father to Pan. Gohan is the first hybrid (half-Earthling, half-Saiyan) to appear in the series. He is named after Goku's adoptive grandfather, Gohan. Fandom\n" +
                        "Children: Pan\n" +
                        "Spouse: Videl\n" +
                        "Aliases: The Great Saiyaman; The Golden Warrior\n" +
                        "Created by: Akira Toriyama\n" +
                        "Voiced by: Masako Nozawa (Toei Animation), MORE",
                section = "Saiyan",
                Image ="https://static0.gamerantimages.com/wordpress/wp-content/uploads/ultimate-gohan-dbz-fighterz.jpg"
            ),
            Person(
                id = 3,
                title = "Trunks",
                body = "Trunks is the Earthling and Saiyan hybrid son of Bulma and Vegeta, and the older brother of Bulla. Fandom\n" +
                        "Species: Human-Saiyan Hybrid\n" +
                        "Created by: Akira Toriyama\n" +
                        "Voiced by: Laura Bailey (Funimation), MORE\n" +
                        "Movies and TV shows: Dragon Ball Z: The History of Trunks",
                section = "Saiyan",
                Image ="https://static0.gamerantimages.com/wordpress/wp-content/uploads/2020/07/Super-saiyan-trunks.jpg?q=50&fit=contain&w=960&h=500&dpr=1.5"
            ),
            Person(
                id = 4,
                title = "Broly",
                body = "Broly is a fictional character in the Dragon Ball series. Two different versions of the character exist: the original Broly, a major villain created by anime screenwriter Takao Koyama who appeared in ... Wikipedia\n" +
                        "Species: Saiyan\n" +
                        "Created by: Takao Koyama (original); Akira Toriyama (reworked)\n" +
                        "First appearance: Dragon Ball Z: Broly – The Legendary Super Saiyan (original, 1993), MORE\n" +
                        "Movies and TV shows: Dragon Ball Z: Broly – The Legendary Super Saiyan",
                section = "Saiyan" ,
                        Image="https://static1.cbrimages.com/wordpress/wp-content/uploads/2019/05/Dragon-Ball-super-broly.jpg?q=50&fit=crop&w=960&h=500&dpr=1.5"
            ),
            Person(
                id = 5,
                title = "Krillin",
                body = "Krillin is a supporting protagonist in the Dragon Ball manga, and the anime series Dragon Ball, Dragon Ball Z, Dragon Ball GT and Dragon Ball Super. Fandom\n" +
                        "Children: Marron\n" +
                        "Species: Human\n" +
                        "Created by: Akira Toriyama\n" +
                        "Spouse: Android 18, Krillin\n" +
                        "Voiced by: Mayumi Tanaka (Toei Animation), Sonny Strait (Funimation), Laurie Steele (Funimation)",
                section = "Human",
                Image="https://dragonball.guru/wp-content/uploads/2022/01/How-old-is-Krillin.jpg"
            ),
            Person(
                id = 6,
                title = "Bulma",
                body = "Bulma is a brilliant scientist and the second daughter of Capsule Corporation's founder Dr. Brief and his wife Panchy, the younger sister of Tights, and is Goku's first friend. Fandom\n" +
                        "Children: Trunks; Bulla\n" +
                        "Spouse: Vegeta\n" +
                        "Voiced by: Hiromi Tsuru (Toei Animation), Monica Rial (Funimation), Tiffany Vollmer (Funimation)",
                section = "Human",
                Image="https://a1cf74336522e87f135f-2f21ace9a6cf0052456644b80fa06d4f.ssl.cf2.rackcdn.com/images/characters/large/800/Bulma.Dragon-Ball.webp"
            ),
            Person(
                id = 7,
                title = "Chi-Chi",
                body = "Chi-Chi is the princess of Fire Mountain and the daughter of the Ox-King who later marries Goku and becomes the loving mother of Gohan and Goten. Fandom\n" +
                        "Spouse: Goku\n" +
                        "Family: Ox-King (father)\n" +
                        "Species: Human\n" +
                        "Created by: Akira Toriyama\n" +
                        "Children: Gohan, Goten\n" +
                        "Voiced by: Laura Bailey (Funimation), ",
                section = "Human",
                Image="https://dragonball.guru/wp-content/uploads/2021/03/chi-chi.jpg"
            ),
            Person(
                id = 8,
                title = "Yamcha",
                body = "Yamcha is a main protagonist in the Dragon Ball manga and in the anime Dragon Ball, and later a supporting protagonist in Dragon Ball Z and Dragon Ball Super, with a few appearances in Dragon Ball GT. He is a former boyfriend of Bulma and the lifelong best friend of Puar. Fandom\n" +
                        "Height (m): 1.83\n" +
                        "First appearance: Dragon Ball chapter #7 Yamcha and Pu'ar: 11 September 1984 (1984)\n" +
                        "Species: Human\n" +
                        "Movies and TV shows: Dragon Ball: Mystical Adventure",
                section = "Human",
                Image="https://pbs.twimg.com/media/E09quZbXsAEAigq?format=jpg&name=large"
            ),
            Person(
                id = 9,
                title = "Mr. Satan",
                body = "Mr. Satan, also known as Hercule Satan in the Funimation dub, is the World Martial Arts Champion and the Earth's protector. His real name is Mark. Fandom\n" +
                        "Children: Videl\n" +
                        "Created by: Akira Toriyama\n" +
                        "Voiced by: Daisuke Gōri (Toei Animation), Unshō Ishizuka (Toei Animation), Chris Rager (Funimation)",
                section = "Human",
                Image="https://static.wikia.nocookie.net/universaldragonball/images/1/19/Dummy.jpg/revision/latest?cb=20121124211801"
            ),
            Person(
                id = 10,
                title = "Android 18",
                body = "Android 18, Lazuli when she was an ordinary human, is the twin sister of Android 17 and Dr. Gero's eighteenth android creation, designed to serve Gero's vendetta against Goku. Fandom\n" +
                        "Children: Marron\n" +
                        "Created by: Akira Toriyama\n" +
                        "Family: Android 17 (twin brother)\n" +
                        "Species: Cyborg\n" +
                        "Voiced by: Miki Itō (Toei Animation), Meredith McCoy (Funimation), Colleen Clinkenbeard (Funimation)",
                section = "Android",
                Image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcSUthBPMuXe6_0rA24d-kEbuswu3LY3D1E5bg&usqp=CAU"
            ),
            Person(
                id = 11,
                title = "Android 17",
                body = "Android 17, Lapis when he was an ordinary Human, is the twin brother of Android 18 and Dr. Gero's 17th android creation, a cyborg due to being a human at one point, and one of his first human subjects, designed to serve Gero's vendetta against Goku who overthrew the Red Ribbon Army as a child. Fandom\n" +
                        "Family: Android 18 (twin sister)\n" +
                        "Children: 3 (one biological and two adopted)\n" +
                        "Created by: Akira Toriyama\n" +
                        "Movies and TV shows: Dragon Ball Z: The History of Trunks,",
                section = "Android",
                Image="https://alfabetajuega.com/hero/2021/12/androide-17-fan-art-dragon-ball-z.jpg?width=1200&aspect_ratio=1200:631"
            ),
            Person(
                id = 12,
                title = "Android 16",
                body = "Android 16 is Dr. Gero's sixteenth Android creation. He was initially designed to serve Gero's vendetta against Goku, who overthrew the Red Ribbon Army as a child, but is later deemed unfit for activation. Fandom",
                section = "Android",
                Image="https://static0.cbrimages.com/wordpress/wp-content/uploads/2018/02/Dragon-Ball-Android-16.jpg"
            ),
            Person(
                id = 13,
                title = "Android 19",
                body = "Android 19 is Dr. Gero's nineteenth creation, designed to serve Gero's vendetta against Goku, who overthrew the Red Ribbon Army as a child. Fandom\n" +
                        "Voiced by: Yukitoshi Hori (Toei Animation), Todd Haberkorn (Funimation), Phillip Wilburn (Funimation)",
                section = "Android",
                Image="https://encrypted-tbn0.gstatic.com/images?q=tbn:ANd9GcTN8WzQzkOme790FtAn0lJGh8z297i7QGhhZA&usqp=CAU"
            ),
            Person(
                id = 14,
                title = "Android 21",
                body = "Android 21 is a fictional character in the Dragon Ball media franchise. Created as part of a collaborative process between Arc System Works and Akira Toriyama, Android 21 makes her debut appearance in ... Wikipedia\n" +
                        "First appearance: Dragon Ball FighterZ (2018)\n" +
                        "Created by: Arc System Works\n" +
                        "Designed by: Akira Toriyama\n" +
                        "Species: Artificial life form (\"Bio-Android\")",
                section = "Android",
                Image="https://wallpaperaccess.com/full/1805701.jpg"
            ),
            Person(
                id = 15,
                title = "Dende",
                body = "Dende is a Namekian with a unique gift that allows him to heal others. He is the 108th son of Grand Elder Guru. On Goku's request, Dende becomes the Earth's Guardian in Kami's place. Fandom\n" +
                        "Voiced by: Aya Hirano (Toei Animation), MORE",
                section = "Namekian",
                Image="https://static.wikia.nocookie.net/dragonball/images/4/45/Dende.png/revision/latest/scale-to-width-down/512?cb=20121130235812"
            ),
            Person(
                id = 16,
                title = "Piccolo",
                body = "Piccolo Jr., usually just called Piccolo also known as Ma Junior, is a Namekian and also the final child and reincarnation of the Demon King Piccolo, later becoming the reunification of the Nameless Namekian after fusing with Kami. Fandom\n" +
                        "Species: Namekian\n" +
                        "Relatives: Piccolo Daimaō (parent / incarnate); Kami (good counterpart, later assimilated); Nail (assimilated)\n" +
                        "Created by: Akira Toriyama\n" +
                        "Apprentice: Gohan\n" +
                        "Voiced by: Christopher Sabat (Funimation), Toshio Furukawa (Toei Animation), Hiromi Tsuru (Toei Animation)\n" +
                        "Movies and TV shows: Dragon Ball Z: The World's Strongest, ",
                section = "Namekian",
                Image="https://sportshub.cbsistatic.com/i/2021/10/11/b9eefc59-16d3-4016-9648-2feed51b34fc/dragon-ball-super-super-hero-2022-movie-piccolo.jpg"
            ),
            Person(
                id = 17,
                title = "Grand Elder Guru",
                body = "Guru is the oldest and wisest remaining Namekian in existence at the time of his appearance. As the creator of the Namekian Dragon Balls, Guru's death would cause them to become inert, unless he passes down his authority to someone else. Fandom\n" +
                        "Voiced by: Junpei Takiguchi (Toei Animation), MORE\n" +
                        "Children: Dende, Maima",
                section = "Namekian",
                Image="https://static.wikia.nocookie.net/dragonball/images/3/3c/Guru_out_of_chair.png/revision/latest/scale-to-width-down/480?cb=20120322232008"
            ),
            Person(
                id = 18,
                title = "King Piccolo",
                body = "King Piccolo, sometimes referred to just as the Daimao was a Demon who once precipitated the Earth into utter mayhem and pandemonium, spawning an army of animal-like Demon sons and converting a peaceful planet into a living hell. Fandom\n" +
                        "Height (m): 2.5\n" +
                        "Children: Piccolo, Ukulele, Tambourine\n" +
                        "Movies and TV shows: Dragon Ball Z: Gather Together! Goku's World, Dragon Ball, Dragonball: Evolution\n" +
                        "Fictional universe: Dragon Ball",
                section = "Namekian",
                Image="https://static1.cbrimages.com/wordpress/wp-content/uploads/2019/07/Demon-King-Piccolo-anime-super.jpg?q=50&fit=crop&w=960&h=500&dpr=1.5"
            ),
            Person(
                id = 19,
                title = "Nail",
                body = "Nail is a supporting protagonist in the Dragon Ball manga and the anime Dragon Ball Z. He is a Namekian described as the 'lone' Warrior-type Namekian left when he first appeared in the manga. He is the personal bodyguard to Grand Elder Guru, and is incredibly strong for a Namekian. Fandom\n" +
                        "Voiced by: Taiten Kusunoki (Toei Animation), Katsuji Mori (Toei Animation), Sean Schemmel (Funimation)",
                section = "Namekian",
                Image="https://static.wikia.nocookie.net/dragonball/images/0/06/NailRegenerationTechnique.png/revision/latest/scale-to-width-down/1280?cb=20180416192831"
            ),
        )
    }
}

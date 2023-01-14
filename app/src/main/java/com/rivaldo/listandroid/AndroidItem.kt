package com.rivaldo.listandroid

data class AndroidItem(
    var id: Int,
    var name: String,
    var versionNumber: String,
    var image: Int,
    var description: String
)

val listAndroidOs = listOf<AndroidItem>(
    AndroidItem(
        id = 1,
        name = "Android 13",
        versionNumber = "13.0",
        image = R.drawable.android_13,
        description = "Android 13 (yang dikenal secara internal dengan code name Tiramisu) diumumkan di blog Android yang diposting pada 10 Februari 2022, dan Pratinjau Developer pertama langsung dirilis untuk seri Google Pixel (dari Pixel 4 ke Pixel 6, dengan mengakhiri dukungan untuk Pixel 3 dan Pixel 3a). Versi ini dirilis sekitar 4 bulan setelah versi stabil dari Android 12 dirilis. Kemudian versi Pratinjau Developer 2 dirilis pada bulan Maret.[6] Saat ini, 4 versi beta rencananya akan dirilis di masa mendatang, masing-masing dirilis pada bulan April, Mei, Juni dan Juli. Stabilitas platform akan tercapai pada bulan Juni, dengan Beta 3."
    ),
    AndroidItem(
        id = 2,
        name = "Android 12",
        versionNumber = "12.0",
        image = R.drawable.android_12,
        description = "Android 12 diumumkan di blog Android yang diposting pada 18 Februari 2021. Pratinjau Developer segera dirilis, dengan dua pratinjau tambahan direncanakan untuk dua bulan berikutnya. Setelah itu, empat rilis beta bulanan direncanakan, dimulai pada Mei, yang terakhir mencapai stabilitas platform pada Agustus, dan ketersediaan umum segera hadir setelah itu."
    ),
    AndroidItem(
        id = 3,
        name = "Android 11",
        versionNumber = "11.0",
        image = R.drawable.android_11,
        description = "Android 12 (secara internal dengan nama kode Android Snow Cone) adalah rilis utama kedua belas dan versi ke-19 dari Android, sistem operasi seluler yang dikembangkan oleh Open Handset Alliance yang dipimpin oleh Google.[4] Beta pertama dirilis pada 18 Mei 2021. Android 12 dirilis secara publik pada 4 Oktober 2021 "
    ),
    AndroidItem(
        id = 4,
        name = "Android 10",
        versionNumber = "10.0",
        image = R.drawable.android_10,
        description = "Android 10 (secara internal dengan nama kode Android Q) adalah rilis utama kedua belas dan versi ke-19 dari Android, sistem operasi seluler yang dikembangkan oleh Open Handset Alliance yang dipimpin oleh Google.[4] Beta pertama dirilis pada 3 Maret 2019. Android 10 dirilis secara publik pada 3 September 2019 "
    ),
    AndroidItem(
        id = 5,
        name = "Android Pie",
        versionNumber = "9.0",
        image = R.drawable.android_9,
        description = "Android 9 \"Pie\" (disebut Android P pada masa pengembangan) adalah penerus dari Android 8.0 Oreo yang merupakan rilisan mayor ke 9 dan pembaruan ke-16 dari sistem operasi Android. Android Pie dirilis untuk pengembang pada Maret 2018 dan mulai dirilis ke publik pada 6 Agustus 2018."
    ),
    AndroidItem(
        id = 6,
        name = "Android Oreo",
        versionNumber = "8.0",
        image = R.drawable.android_8,
        description = "Android Oreo (kode nama Android O selama pengembangan) adalah versi kedelapan dari sistem operasi Android mobile. Ini pertama kali dirilis sebagai preview pengembang ala kualitas pada tanggal 21 Maret 2017. Pratinjau pengembang kedua dirilis pada 17 Mei 2017, dan ini dianggap sebagai kualitas beta dan preview pengembang ketiga dirilis pada tanggal 8 Juni 2017 dan menyelesaikan API. Pada 24 Juli 2017, pratinjau pengembang keempat dirilis yang mencakup perilaku sistem akhir dan perbaikan bug dan pengoptimalan terbaru.[4] Ini dirilis ke publik pada tanggal 21 Agustus 2017. Google meluncurkan sebuah patung pembaruan bertema pencuci mulut di 14th Street Park di Manhattan, dekat dengan pabrik Nabisco asli yang menciptakan Oreo pertama."
    ),
    AndroidItem(
        id = 7,
        name = "Android Nougat",
        versionNumber = "7.0",
        image = R.drawable.android_7,
        description = "Android Nougat 7.0, 7.1, 7.1.1, 7.1.2 (Android 7)[3] adalah pengganti dari Android Marshmallow, dan merupakan versi Android kedua terbaru yang telah dirilis. Versi ini diumumkan pada tanggal 1 Juli 2016, dan diluncurkan pada 23 Agustus 2016. \n Android Nougat memiliki fitur dan spesifikasi berupa vulkan, pemberitahuan yang bentuknya telah diperbarui dengan beberapa aplikasi Google dan layar pisah serta mendukung beberapa bahasa dan Doze on the Go"
    ),
    AndroidItem(
        id = 8,
        name = "Android Marshmallow",
        versionNumber = "6.0",
        image = R.drawable.android_6,
        description = "Android 6.0 dan 6.0.1 \"Marshmallow\"adalah versi utama keenam dari sistem operasi Android dan versi ke 13 dari Android. Pertama kali dirilis sebagai versi beta pada 28 Mei 2015, secara resmi dirilis pada 5 Oktober 2015, dengan perangkat Nexus menjadi yang pertama menerima pembaruan.\n" +
                "\n" +
                "Marshmallow terutama berfokus pada peningkatan pengalaman pengguna secara keseluruhan dari pendahulunya, Lollipop. Ini memperkenalkan arsitektur izin baru, API baru untuk asisten kontekstual (pertama kali digunakan oleh fitur baru \"Now on Tap\" untuk memberikan hasil pencarian yang peka terhadap konteks), sistem manajemen daya baru yang mengurangi aktivitas latar belakang ketika perangkat tidak ditangani secara fisik, dukungan asli untuk pengenalan sidik jari dan konektor USB-C, kemampuan untuk memigrasikan data dan aplikasi ke kartu microSD, dan perubahan internal lainnya.\n" +
                "\n" +
                "Pada Maret 2020, 10% perangkat Android menggunakan ini tidak didukung (untuk pembaruan keamanan) Android 6.0 (API 23)"
    ),
    AndroidItem(
        id = 9,
        name = "Android Lollipop",
        versionNumber = "5.0",
        image = R.drawable.android_5,
        description = "Android 5.0 dan 5.0.1 \"Lollipop\" adalah versi Utama Kelima dari sistem operasi Android, Dan versi ke 12 dari Sistem Operasi Android yang dikembangkan oleh Google, yang pada saat ini mencakup versi antara 5.0, 5.0.1 dan 5.1.1.[4]Diresmikan pada 3 november 2014 saat Google I / O, dan tersedia secara resmi melalui over-the-air (OTA) update pada tanggal 3 November 2014 untuk memilih perangkat yang menjalankan distribusi Android dilayani oleh Google (seperti perangkat Nexus dan Google Play edition). Kode sumbernya dibuat tersedia pada 3 November 2014."
    ),
    AndroidItem(
        id = 10,
        name = "Android KitKat",
        versionNumber = "4.4",
        image = R.drawable.android_4_4,
        description = "Android 4.4 \"KitKat\" adalah versi dari sistem operasi telepon genggam Android yang dikembangkan oleh Google. Google mengumumkan Android 4.4 KitKat pada tanggal 3 September 2013. Meskipun pada awalnya di bawah nama sandi \"Key Lime Pie\" (\"KLP\"), nama itu berubah karena \"sangat sedikit orang benar-benar tahu rasa key lime pie.\" Beberapa blogger teknologi juga mengharapkan rilis \"Key Lime Pie\" menjadi Android 5. KitKat memulai debutnya pada Google Nexus 5 pada tanggal 31 Oktober 2013, dan dioptimalkan untuk berjalan pada rentang yang lebih besar dari perangkat dari versi Android sebelumnya, memiliki 512 MB RAM sebagai minimum yang disarankan; perbaikan-perbaikan yang dikenal sebagai \"Proyek langsing\" internal di Google. Jumlah minimum RAM yang diperlukan yang tersedia untuk Android adalah 340 MB, dan semua perangkat dengan kurang dari 512 MB RAM harus melaporkan diri mereka sebagai perangkat dengan \"RAM rendah\"."
    ),
    )

package com.ardi.topuniversity;

import java.util.ArrayList;

public class UniversityData {
    private static String[] univName = {
            "Universitas Indonesia",
            "Universitas Gadjah Mada",
            "Institut Teknologi Bandung",
            "Institut Teknologi Sepuluh Nopember",
            "Institut Pertanian Bogor",
            "Universitas Brawijaya",
            "Universitas Sebelas Maret",
            "Universitas Syiah Kuala",
            "Universitas Airlangga",
            "Universitas Sumatera Utara"
    };

    private static String[] detailUniv = {
            "Universitas Indonesia adalah kampus modern, komprehensif, terbuka, multi budaya, dan humanis yang mencakup disiplin ilmu yang luas. UI saat ini secara simultan selalu berusaha menjadi salah satu universitas riset atau institusi akademik terkemuka di dunia. Sebagai universitas riset, upaya-upaya pencapaian tertinggi dalam hal penemuan, pengembangan dan difusi pengetahuan secara regional dan global selalu dilakukan. Sementara itu, UI juga memperdalam komitmen dalam upayanya di bidang pengembangan akademik dan aktifitas penelitian melalui sejumlah disiplin ilmu yang ada dilingkupnya.\n" +
                    "Cikal bakal UI bermula pada tahun 1849 dan UI merupakan representasi institusi pendidikan dengan sejarah paling tua di Asia. Telah menghasilkan lebih dari 400.000 alumni, UI secara kontinyu melanjutkan peran pentingnya di level nasional dan dunia. Bagaimanapun UI tidak bisa melepaskan diri dari misi terkininya menjadi institusi pendidikan berkualitas tinggi, riset standar dunia dan menjaga standar gengsi di sejumlah jurnal internasional.\n",
            "Universitas Gadjah Mada lahir dari kancah perjuangan revolusi kemerdekaan bangsa Indonesia. Didirikan pada periode awal kemerdekaan, UGM didaulat sebagai Balai Nasional Ilmu Pengetahuan dan Kebudayaan bagi penyelenggaraan pendidikan tinggi nasional.\n" +
                    "Berdiri dengan nama “Universitas Negeri Gadjah Mada”, perguruan tinggi ini merupakan gabungan dari beberapa sekolah tinggi yang telah lebih dulu didirikan, di antaranya Balai Perguruan Tinggi Gadjah Mada, Sekolah Tinggi Teknik, dan Akademi Ilmu Politik yang terletak di Yogyakarta, Balai Pendidikan Ahli Hukum di Solo, serta Perguruan Tinggi Kedokteran Bagian Praklinis di Klaten, yang disahkan dengan Peraturan Pemerintah No. 23 Tahun 1949 tentang Peraturan Penggabungan Perguruan Tinggi menjadi Universiteit.\n",
            "Institut Teknologi Bandung (ITB), didirikan pada tanggal 2 Maret 1959. Kampus utama ITB saat ini merupakan lokasi dari sekolah tinggi teknik pertama di Indonesia. Walaupun masing-masing institusi pendidikan tinggi yang mengawali ITB memiliki karakteristik dan misi masing-masing, semuanya memberikan pengaruh dalam perkembangan yang menuju pada pendirian ITB.\n" +
                    "Sejarah ITB bermula seja awal abad kedua puluh, atas prakarsa masyarakat penguasa waktu itu. Gagasan mula pendirianya terutama dimaksudkan untuk memenuhi kebutuhan tenaga teknik yang menjadi sulit karena terganggunya hubungan antara negeri Belanda dan wilayah jajahannya di kawasan Nusantara, sebagai akibat pecahnya Perang Dunia Pertama. De Techniche Hoogeschool te Bandung berdiri tanggal 3 Juli 1920 dengan satu fakultas de Faculteit van Technische Wetenschapyang hanya mempunyai satu jurusan de afdeeling der Weg en Waterbouw.\n",
            "Institut Teklologi Sepuluh Nopember adalah perguruan tinggi negeri yang terletak di Surabaya. ITS awalnya didirikan oleh Yayasan Perguruan Tinggi Teknik (YPTT) yang diketuai oleh dr. Angka Nitisastro pada tanggal 10 November 1957.\n" +
                    "Dies Natalis ITS pertama adalah 10 November 1960, sementara nama ITS mulai digunakan dalam Peraturan Pemerintah No. 9 tahun 1961 (ditetapkan tanggal 23 Maret 1961). Dalam visi awal, ITS ditujukan untuk mendidik para pemimpin yang unggul di bidang sains dan teknologi, untuk mengangkat Republik Indonesia menjadi negara berperadaban maju dan tinggi.\n" +
                    "Kampus ITS Sukolilo menempati areal seluas 180 hektare, dengan luas bangunan seluruhnya kurang lebih 150.000 m2. Selain itu terdapat Kampus Manyar yang dipergunakan oleh Program D-3 dan D-4 Teknik Sipil dengan luas bangunan 5.176 m2 dan Kampus ITS Cokroaminoto yang dipergunakan untuk magister manejemen serta beberapa lembaga kerjasama dengan luas bangunan 4.000 m2.\n",
            "Institut Pertanian Bogor adalah sebuah perguruan tinggi pertanian negeri yang berkedudukan di Bogor.\n" +
                    "Sebelum diresmikan pada tahun 1963, IPB adalah sebuah fakultas pertanian pada Universitas Indonesia. Pada tanggal 1 September 1963. Presiden Pertama Indonesia, Ir. Soekarno, melakukan peletakkan batu pertama pembangunan kampus sekaligus menandai peresmian Institut Pertanian Bogor sebagai sebuah perguruan tinggi mandiri.\n" +
                    "Saat ini, Rektor IPB untuk periode 2017-2022 adalah Dr. Arif Satria, SP, M.Si.\n" +
                    "Berdasarkan hasil keputusan rapat pleno Badan Akreditasi Nasional Perguruan Tinggi (BAN-PT) tanggal 7 November 2017, BAN-PT memutuskan bahwa Institut Pertanian Bogor (IPB) memperoleh status terakreditasi dengan peringkat A (sangat baik).\n",
            "Universitas Brawijaya berkedudukan di Kota Malang, Jawa Timur, didirikan pada tanggal 5 Januari 1963 dengan Surat Keputusan Menteri Perguruan Tinggi dan Ilmu Pengetahuan (PTIP) Nomor 1 Tahun 1963, dan kemudian dikukuhkan dengan Keputusan Presiden Republik Indonesia Nomor 196 Tahun 1963 tertanggal 23 September 1963.\n" +
                    "Universitas ini semula berstatus swasta, dengan embrio sejak tahun 1957, yaitu berupa Fakultas Hukum dan Fakultas Ekonomi yang merupakan cabang Universitas Swasta Sawerigading, Makasar. Kedua fakultas itu perkembangannya nampak kurang menggembirakan, sehingga di kalangan mahasiswa timbul keresahan.\n" +
                    "Beberapa orang dan tokoh mahasiswa yang menyadari hal ini kemudian mengadakan pendekatan-pendekatan kepada para pemuka masyarakat. Akhirnya, pada suatu pertemuan yang mereka lakukan di Balai Kota Malang pada tanggal 10 Mei 1957, tercetus gagasan untuk mendirikan sebuah Universitas kotapraja (Gemeentelijke Universiteit) yang diharapkan lebih dapat menjamin masa depan para mahasiswa.\n",
            "Universitas Sebelas Maret berdiri sejak 11 Maret 1976, yang awalnya merupakan gabungan dari 5 perguruan tinggi yang ada di Surakarta. 5 perguruan tinggi tersebut: Institut Pelatihan dan Pendidikan Guru Surakarta, Sekolah Menengah Olahraga Surakarta, Akademi Administrasi Bisnis Surakarta, Universitas Gabungan Surakarta (universitas ini adalah gabungan dari beberapa universitas di Surakarta termasuk Universitas Islam Indonesia Surakarta) dan Fakultas Obat-obatan Departemen Pertahanan dan Keamanan Pengembangan Pendidikan Tinggi Nasional Surakarta. Pengabungan beberapa perguruan tinggi tersebut, mempunyai satu tujuan yang besar, yakni meningkatkan kualitas pendidikan tinggi di Surakarta. Setelah 5 tahun melakukan konsolidasi, UNS mempersiapkan diri untuk memulai proses perkembangannya. Pembanguan secara fisik dimulai pada tahun 1980. Di bawah kepemimpinan dr. Prakosa, kampus yang semula terletak di di beberapa tempat disatukan dalam suatu kawasan. Lokasi tersebut adalah di daerah Kenthingan, di tepi Sungai Bengawan Solo, dengan cakupan area sekitar 60 hektare. Di daerah Kenthingan inilah, pembangunan kampus tahap pertama berakhir pada tahun 1985.\n" +
                    "Pembangunan fisik kampus yang tergolong cepat, juga diimbangi dengan perkembangan di sektor yang lain. Tahun 1986, Prof. Dr. Koento Wibisono selaku rektor berikutnya, melakukan peletakan dasar-dasar percepatan pertumbuhan, Pada masa ini, perubahan telah terjadi, seperti perkembangan yang cukup bagus dalam bidang akademik dan jumlah staf, juga dalam penguatan infrastruktur kampus.\n",
            "Universitas Syiah Kuala (Unsyiah) adalah perguruan tinggi negeri tertua di Aceh. Berdiri pada tanggal 2 September 1961 dengan Surat Keputusan Menteri Pendidikan Tinggi dan Ilmu Pengetahuan Nomor 11 tahun 1961, tanggal 21 Juli 1961. Pendirian Unsyiah dikukuhkan dengan Keputusan Presiden Republik Indonesia, nomor 161 tahun 1962, tanggal 24 April 1962 di Kopelma Darussalam, Banda Aceh. Unsyiah berkedudukan di Ibukota Provinsi Aceh dengan kampus utama terletak di Kota Pelajar Mahasiswa (Kopelma) Darussalam, Banda Aceh. Saat ini, Unsyiah memiliki lebih dari 30.000 orang mahasiswa yang menuntut ilmu di 12 Fakultas dan Program Paska Sarjana.\n" +
                    "Sebagai salah satu institusi pendidikan tinggi, Unsyiah memiliki fungsi yang sangat strategis dalam meningkatkan kualitas sumber daya manusia, baik untuk kebutuhan lokal, nasional maupun regional. Sebagai universitas Jantung Hati Rakyat Aceh yang mengutamakan mutu, Unsyiah mengintegrasikan nilai-nilai universal, nasional, dan lokal untuk melahirkan sumberdaya manusia yang memiliki keselarasan dalam antara IPTEK dan IMTAQ. Keseimbangan diantara keduanya menjadi komponen utama dalam menghasilkan sumber daya manusia yang berkualitas, berbudi pekerti, menjunjung tinggi etika, estetika serta berakhlak mulia.\n",
            "Berdirinya Universitas Airlangga memiliki sejarah yang cukup panjang. Sebelum Unair resmi didirikan, pada tanggal 9 dan 11 Oktober 1847, disampaikan usul kepada Pemerintah Kolonial Belanda untuk mendidik pemuda-pemuda Jawa yang berbakat menjadi ahli-ahli praktik kesehatan. Pada tanggal 2 Januari 1849, melalui Keputusan Pemerintah No. 22, didirikan NIAS (Nederlandsch Indische Artsen School) sebagai tempat pendidikan dokter di Surabaya. Sejak tahun 1913, pendidikan dokter di Surabaya berlangsung di Jl. Kedungdoro 38 Surabaya. Pada tahun 1923 gedung NIAS dipindah dari Jl. Kedungdoro ke tempat berdirinya Fakultas Kedokteran Unair di Jl. Mayjen. Prof. Dr. Moestopo Surabaya.\n" +
                    "Universitas Airlangga secara resmi berdiri pada tahun 1954 berdasarkan Peraturan Pemerintah No. 57/1954 dan diresmikan oleh Presiden Republik Indonesia pada tanggal 10 November 1954, bertepatan dengan perayaan hari pahlawan yang kesembilan. Pada tahun yang sama pula berdiri Fakultas Hukum yang dulunya merupakan cabang dari Fakultas Hukum, Ekonomi dan Sosial Politik Universitas Gadjah Mada, Yogyakarta.\n",
            "Universitas Sumatera Utara (USU) adalah sebuah universitas negeri yang terletak di Kota Medan, Indonesia. Universitas Sumatera Utara adalah salah satu universitas terbaik di pulau Sumatra. USU juga adalah universitas pertama dan satu satunya punya jurusan D3 Statistika di dunia serta di pulau Sumatra yang mempunyai Fakultas Kedokteran. ta USU didirikan sebagai Yayasan Universitet Sumatra Utara pada tanggal 4 Juni 1952. Fakultas pertama adalah Fakultas Kedokteran yang didirikan pada 20 Agustus 1952, yang kini diperingati sebagai hari jadi USU. Presiden Indonesia, Soekarno kemudian meresmikan USU sebagai universitas negeri ketujuh di Indonesia pada tanggal 20 November 1957."
    };

    private static String[] alamatUniv = {
            "Depok, Jawa Barat, Indonesia",
            "Sleman, Yogyakarta, Indonesia",
            "Bandung, Jawa Barat, Indonesia",
            "Surabaya, Jawa Timur, Indonesia",
            "Bogor, Jawa Barat, Indonesia",
            "Malang, Jawa Timur, Indonesia",
            "Surakarta, Jawa Tengah, Indonesia",
            "Kota Banda Aceh, Aceh, Indonesia",
            "Surabaya, Jawa Timur, Indonesia",
            "Medan, Sumatra Utara, Indonesia"
    };

    private static String[] websiteUniv = {
            "https://www.ui.ac.id/",
            "https://www.ugm.ac.id/",
            "https://www.itb.ac.id/",
            "https://www.its.ac.id/",
            "https://www.ipb.ac.id/",
            "https://www.ub.ac.id/",
            "https://www.uns.ac.id/",
            "https://unsyiah.ac.id/",
            "https://unair.ac.id/",
            "https://www.usu.ac.id/id/"
    };

    private static int[] logoUniv = {
            R.drawable.ui,
            R.drawable.ugm,
            R.drawable.itb,
            R.drawable.its,
            R.drawable.ipb,
            R.drawable.brawijaya,
            R.drawable.uns,
            R.drawable.syiahkuala,
            R.drawable.airlangga,
            R.drawable.usu

    };

    private static int[] fotoUniv = {
            R.drawable.gambar_ui,
            R.drawable.gambar_ugm,
            R.drawable.gambar_itb,
            R.drawable.gambar_its,
            R.drawable.gambar_ipb,
            R.drawable.gambar_brawijaya,
            R.drawable.gambar_sebelasmaret,
            R.drawable.gambar_syiahkuala,
            R.drawable.gambar_airlangga,
            R.drawable.gambar_usu
    };

    static ArrayList<University> getListData() {
        ArrayList<University> list = new ArrayList<>();
        for (int i = 0; i < univName.length; i++) {
            University university = new University();
            university.setNamaUniv(univName[i]);
            university.setDetailUniv(detailUniv[i]);
            university.setAlamatUniv(alamatUniv[i]);
            university.setWebsiteUniv(websiteUniv[i]);
            university.setLogoUniv(logoUniv[i]);
            university.setFotoUniv(fotoUniv[i]);
            list.add(university);
        }
        return list;
    }
}

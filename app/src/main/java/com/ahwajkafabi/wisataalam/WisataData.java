package com.ahwajkafabi.wisataalam;

import java.util.ArrayList;

public class WisataData {
    public static String[][] data = new String[][] {
            {"Bukit Goa Lawa", "Bukit Goa Lawa adalah kawasan perbukitan yang terletak di Kecamatan Balapulang, Kabupaten Tegal. Bukit ini memiliki tumpukan batu yang menjulang tinggi menyerupai menara. Nah, di batu inilah wisatawan biasanya kerap melakukan foto selfie atau mengambil foto pemandangan hijau dari kawasan hutan yang ada di bawahnya.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Bukit-Goa-Lawa-278x300.jpg"},
            {"Curug Pitu Margasari", "Curug Pitu adalah salah satu air terjun di Tegal yang banyak diburu oleh wisatawan terutama bagi mereka yang menyukai tantangan. Akses ke tempat wisata di Tegal ini bisa dibilang cukup sulit karena membutuhkan perjalanan selama 2 jam berjalan kaki dari lokasi parkiran. Wisatawan juga harus melalui medan yang cukup terjal untuk sampai ke curug yang terjun dari perbukitan batu ini.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Curug-Pitu-Margasari-300x225.jpg"},
            {"Taman Wisata Air Panas Guci", "Taman Wisata Air Panas Guci adalah destinasi favorit warga Tegal yang selalu ramai dikunjungi saat akhir pekan. Tempat wisata di Tegal ini terletak di Desa Guci, Kecamatan Bumijaya, Tegal. Wisatawan yang ingin mandi air panas atau terapi penyakit tulang dan kulit bisa datang ke sini dengan menggunakan kendaraan pribadi atau kendaraan umum.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Taman-Wisata-Air-Panas-Guci-300x194.jpg"},
            {"Pantai Alam Indah Tegal", "Terletak di Jalan Bali, Martoloyo, Kota Tegal, pantai yang berada di pesisir utara ini cukup populer di kalangan warga setempat. Saat akhir pekan atau hari libur, tempat wisata di Tegal ini akan dipenuhi oleh wisatawan yang mayoritas adalah anak muda dan keluarga yang ingin mengajak anak-anaknya menikmati alam.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Pantai-Alam-Indah-Tegal-300x182.jpg"},
            {"Waduk Cacaban", "Waduk Cacaban adalah waduk buatan yang diinisiasi oleh Belanda ratusan tahun silam. Dahulu kala, kawasan ini digunakan sebagai sistem perairan dan juga sumber air minum sebelum berubah fungsi menjadi sebuah tempat wisata setelah Indonesia merdeka dan Tegal terpecah menjadi dua wilayah.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Waduk-Cacaban-300x225.jpg"},
            {"Kebun Teh Tegal", "Sebagai salah satu produsen teh terbesar di Indonesia, Tegal memiliki beberapa perkebunan yang kerap dijadikan destinasi wisata oleh para wisatawan. Kebun teh yang selalu ramai dikunjungi saat akhir pekan terletak di Bumijaya, Tegal, sekitar 15 menit perjalanan dari Bulakan.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Kebun-Teh-Tegal-300x180.jpg"},
            {"Curug Cantel", "Curug Cantel adalah air terjun yang memiliki ketinggian kurang lebih 60 meter. Tingginya tebing yang menjadi permulaan air jatuh ke bawah membuat kawasan ini menjadi lembap dan segar karena memiliki butir-butir air. Wisatawan yang berada di bawah air terjun bisa menikmati kemegahan air terjun sembari bermain air di aliran sungai yang ada di bawahnya.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Curug-Cantel-300x225.jpg"},
            {"Konsorsium Rumah Wayang", "Konsorsium Rumah Wayang dimiliki oleh dalang Ki Kenthus yang namanya sudah tenar di kawasan Tegal dan Jawa Tengah. Beliau mengoleksi cukup banyak jenis wayang dari berbagai daerah di Indonesia. Wayang ini dipajang dan dipamerkan untuk umum agar masyarakat di Tegal bisa mengenal banyak wayang, tidak hanya jenis kulit saja.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Konsorsium-Rumah-Wayang-300x172.jpg"},
            {"Wisata Kesehatan Jamu", "Selain memiliki wisata alam berupa curug atau wisata air panas, wisatawan yang ingin menghabiskan liburan di Tegal juga bisa mengunjungi Wisata Kesehatan Jamu atau WKJ. Tempat wisata di Tegal yang unik dan belum ada di daerah lain ini dibuka pertama kali pada tahun 2012 sebagai salah satu cara untuk memperkenalkan jamu ke seluruh Indonesia.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Wisata-Kesehatan-Jamu-300x191.jpg"},
            {"Situs Manusia Purba Semedo", "Tegal juga memiliki tempat wisata sejarah berupa situs manusia purba yang terletak di kawasan Semedo. Situs ini tidak sebesar Sangiran yang sudah ditemukan puluhan tahun silam. Situs Semedo hanya memiliki satu bangunan kecil yang di dalamnya menyimpan banyak koleksi tulang-belulang yang baru ditemukan tahun 2005 silam.", "http://anekatempatwisata.com/wp-content/uploads/2017/09/Situs-Manusia-Purba-Semedo-300x194.jpg"},
    };

    public static ArrayList<Wisata> getListData(){
        ArrayList<Wisata> list = new ArrayList<>();
        for (String[] aData : data) {
            Wisata wisata = new Wisata();
            wisata.setName(aData[0]);
            wisata.setDesc(aData[1]);
            wisata.setPhoto(aData[2]);

            list.add(wisata);
        }

        return list;
    }
}

# FINAL PROJECT WEB

# TC001: Register dengan Username yang Sudah Terdaftar
## Deskripsi
Test ini bertujuan untuk memastikan bahwa sistem memberikan pesan yang jelas kepada pengguna saat mereka mencoba mendaftarkan akun menggunakan username yang sudah terdaftar sebelumnya di website.
## Langkah-langkah Uji
1. Pengguna membuka website [Advantage Online Shopping](https://advantageonlineshopping.com/?authuser=0#/).
2. Pengguna mengklik menu "User" pada navigation bar.
3. Pengguna mengklik "Create New Account".
4. Pengguna mengisi kolom username dengan username yang sudah terdaftar sebelumnya pada website.
5. Pengguna mengisi kolom isian lainnya dengan informasi yang valid.
6. Pengguna mengklik tombol "Register".
## Hasil yang Diharapkan
Sistem menampilkan pesan kesalahan yang menginformasikan bahwa username sudah terdaftar sebelumnya.
## Hasil Aktual
Sistem menampilkan pesan kesalahan yang menginformasikan bahwa username sudah terdaftar sebelumnya.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# TC002: Sign In
## Deskripsi
Test ini bertujuan untuk memastikan bahwa pengguna dapat masuk setelah memasukkan username dan password yang valid.
## Langkah-langkah Uji
1. Pengguna membuka website [Advantage Online Shopping](https://advantageonlineshopping.com/?authuser=0#/).
2. Pengguna mengklik "USER" pada navigation bar.
3. Pengguna mengisi kolom isian username dan password dengan informasi yang valid.
4. Pengguna mencentang checkbox "Remember Me".
5. Pengguna mengklik tombol "Sign In".
## Hasil yang Diharapkan
Pengguna berhasil masuk ke website dan ditampilkan halaman beranda.
## Hasil Aktual
Pengguna berhasil masuk ke website dan ditampilkan halaman beranda.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# TC003: Mengubah Data Akun
## Deskripsi
Test ini bertujuan untuk memastikan bahwa pengguna dapat dengan sukses mengubah informasi akun mereka, dan bahwa sistem merespons dengan benar terhadap perubahan tersebut.
## Prasyarat
- Pengguna sudah sign in dalam website.
- Terdapat data akun pengguna yang dapat diubah seperti password, nama depan, nama belakang, nomor telepon, dan data lainnya.
## Langkah-langkah Uji
1. Pengguna membuka menu "User" pada navigation bar.
2. Pengguna mengklik "My Account".
3. Pengguna mengklik "Edit" pada bagian "Account Details".
4. Pengguna memilih kolom data yang ingin diubah.
5. Pengguna memasukkan data baru atau menyunting data sesuai kebutuhan.
6. Pengguna mengklik tombol "Save".
## Hasil yang Diharapkan
- Sistem harus menerima perubahan data akun pengguna tanpa kesalahan dan menyimpannya dengan benar.
- Pengguna harus menerima konfirmasi atau pesan sukses yang menegaskan bahwa perubahan telah disimpan.
- Setelah perubahan disimpan, sistem harus menampilkan data akun yang diperbarui dengan benar di halaman profil atau pengaturan akun.
## Hasil Aktual
- Sistem gagal menyimpan perubahan data akun pengguna dengan benar.
- Sistem gagal menampilkan data akun yang diperbarui dengan benar.
- Pengguna menerima konfirmasi atau pesan sukses yang menegaskan bahwa perubahan telah disimpan.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# TC004: Sign Out
## Deskripsi
Test ini bertujuan untuk memastikan bahwa pengguna akan dikeluarkan dari akun mereka oleh sistem.
## Prasyarat
Pengguna sudah sign in dalam website.
## Langkah-langkah Uji
1. Pengguna membuka menu "User" pada navigation bar.
2. Pengguna mengklik "Sign Out".
## Hasil yang Diharapkan
- Sistem harus menyelesaikan proses Sign out dengan sukses.
- Pengguna harus diarahkan ke halaman login atau halaman utama aplikasi setelah logout.
- Pengguna tidak boleh lagi memiliki akses ke fitur yang memerlukan autentikasi, seperti halaman profil atau fitur payment, setelah logout.
## Hasil Aktual
- Pengguna diarahkan ke halaman login atau halaman utama aplikasi setelah logout.
- Pengguna tidak memiliki akses ke fitur yang memerlukan autentikasi setelah logout.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# TC006: Navigasi Menu Utama
## Deskripsi
Test ini bertujuan untuk memastikan bahwa pengguna dapat dengan lancar menavigasi menu utama untuk mengakses halaman-halaman utama website, dan bahwa sistem merespons dengan benar terhadap permintaan navigasi.
## Prasyarat
Pengguna berada pada halaman beranda website.
## Langkah-langkah Uji
1. Pengguna menuju navigation bar website.
2. Identifikasi dan pilih opsi-opsi menu utama yang ingin diakses, seperti "Our Product", "Special Offer", "Popular Items", "Contact Us".
3. Klik pada setiap opsi menu utama secara berurutan untuk menavigasi ke halaman terkait.
## Hasil yang Diharapkan
- Sistem harus mengarahkan pengguna ke bagian halaman yang sesuai.
- Setiap opsi menu utama harus mengarahkan pengguna ke bagian halaman yang relevan dan konsisten dengan labelnya.
## Hasil Aktual
- Sistem mengarahkan pengguna ke bagian halaman yang sesuai.
- Setiap opsi menu utama mengarahkan pengguna ke bagian halaman yang relevan dan konsisten dengan labelnya.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# TC007: Mengirimkan Pesan Email (Contact Us)
## Deskripsi
Test ini bertujuan untuk memastikan bahwa pengguna dapat mengirimkan pesan email ke pihak admin atau tim dukungan pelanggan website dengan lancar.
## Prasyarat
Pengguna sudah berada pada halaman beranda website.
## Langkah-langkah Uji
1. Pengguna klik menu "Contact Us" pada navigation bar.
2. Pengguna mengisi data yang diperlukan seperti dengan informasi yang valid.
3. Pengguna klik tombol "Send" untuk mengirimkan pesan.
## Hasil yang Diharapkan
Pengguna harus menerima informasi pesan sukses yang menegaskan bahwa pesan telah berhasil terkirim.
## Hasil Aktual
Pengguna menerima informasi pesan sukses yang menegaskan bahwa pesan telah berhasil terkirim.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# TC008: Product Details
## Deskripsi
Test ini bertujuan untuk memastikan bahwa pengguna dapat melihat informasi yang akurat dan lengkap tentang produk yang mereka minati, serta memastikan bahwa sistem merespons dengan benar terhadap permintaan untuk melihat detail produk.
## Prasyarat
- Pengguna sudah memiliki produk yang diminati untuk dilihat informasi detailnya.
- Pengguna sudah melakukan pencarian produk dan sistem menampilkan produk yang relevan.
## Langkah-langkah Uji
1. Pengguna klik salah satu produk berdasarkan hasil pencarian produk.
2. Pengguna memeriksa informasi yang tersedia tentang produk, termasuk nama, deskripsi, gambar, harga, warna, dan informasi lainnya.
## Hasil yang Diharapkan
- Sistem harus menampilkan informasi yang akurat dan lengkap tentang produk.
## Hasil Aktual
Sistem menampilkan informasi yang akurat dan lengkap tentang produk.
## Status
Lolos
## Catatan
Hasil sesuai dengan harapan. Test berhasil.

# Test Case: TC009 - Menambahkan Produk Ke Keranjang
## Deskripsi
Memastikan bahwa pengguna dapat dengan sukses menambahkan produk yang mereka pilih ke dalam keranjang belanja mereka.
## Prasyarat
- User sudah melakukan pencarian produk.
- User sudah berada halaman detail produk untuk produk yang diminati.
## Langkah-langkah Uji
1. User mencari tombol "Add to Cart" yang memungkinkan pengguna untuk menambahkan produk ke keranjang belanja.
2. User Klik tombol "Add to Cart" tersebut untuk menambahkan produk ke keranjang.
## Hasil yang Diharapkan
Sistem harus merespons dengan menambahkan produk tersebut ke keranjang belanja user.
## Hasil Aktual
Sistem harus merespons dengan menambahkan produk tersebut ke keranjang belanja user.
## Status
Lolos
## Catatan
Sesuai harapan.

# Test Case: TC010 - Checkout Product
## Deskripsi
Memastikan bahwa pengguna dapat menyelesaikan proses pembelian produk dengan lancar.
## Prasyarat
-	User telah berhasil login atau mengakses website e-commerce.
-	Keranjang belanja telah diisi dengan produk yang ingin dibeli.
-	Informasi pengiriman dan pembayaran telah dimasukkan
## Langkah-langkah Uji
1.	Akses halaman keranjang belanja di website e-commerce.
2.	Periksa produk yang telah ditambahkan ke keranjang belanja, termasuk kuantitas, harga, dan total belanja.
3.	User klik tombol Checkout
4.	User memeriksa informasi pengiriman 
5.	User klik next
6.	User memilih metode payment sesuai yang diinginkan 
7.	User klik Pay Now.
## Hasil yang Diharapkan
-	Sistem harus mengarahkan pengguna ke halaman order payment untuk melanjutkan proses pengisian informasi pengiriman dan metode pembayaran
-	User harus menerima konfirmasi atau pesan sukses yang menegaskan bahwa pembayaran mereka telah berhasil diproses setelah menyelesaikan proses pembayaran.
-	Informasi pesanan, termasuk detail produk, alamat pengiriman, dan informasi pembayaran, harus tersedia untuk dilihat oleh User setelah menyelesaikan pembayaran
## Hasil Aktual
-	Sistem mengarahkan pengguna ke halaman order payment untuk melanjutkan proses pengisian informasi pengiriman dan metode pembayaran
-	User menerima konfirmasi atau pesan sukses yang menegaskan bahwa pembayaran mereka telah berhasil diproses setelah menyelesaikan proses pembayaran.
-	Informasi pesanan, termasuk detail produk, alamat pengiriman, dan informasi pembayaran, tersedia untuk dilihat oleh User setelah menyelesaikan pembayaran pada menu My Order
## Status
Lolos
## Catatan
Sesuai harapan.

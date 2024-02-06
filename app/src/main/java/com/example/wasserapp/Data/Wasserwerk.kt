package com.example.wasserapp.Data

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey
import androidx.room.parser.Table
import java.sql.Blob
import java.sql.Timestamp
import java.util.Date


@Entity
@Table(name = "Adresse")
data class Adresse(
    @Id
    val AdresseID: Int,

    val Strasse: String?,

    val PLZ: String?,

    val Ort: String?
)

@Entity
@Table(name = "Kunde")
data class Kunde(
    @Id
    val KundenID: Int,

    val Vorname: String?,

    val Nachname: String?,

    val Telefonnummer: String?,

    val Email: String?
)

@Entity
@Table(name = "Kunden_tabel")
data class KundenTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Kunden_id: Int,

    val Kunden_name: String?
)

@Entity
@Table(name = "KundenVerlauf_tabel")
data class KundenVerlaufTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val KundenVerlauf_id: Int,

    val fk_Zaehler_id: Int,

    val Kunden_id: Int?,

    val Datum_von: Date?,

    val Datum_bis: Date?
)

@Entity
@Table(name = "Messung_tabel")
data class MessungTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Messung_id: Int,

    val Messung_image: Blob?,

    val Messung_wasserstand: Double?,

    val Messung_datetime: Timestamp?,

    val Messung_herkunft: String?,

    val Messung_kunden_id: Int?,

    val fk_Zaehler_id: Int
)

@Entity
@Table(name = "SubMessung_tabel")
data class SubMessungTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val SubMessung_id: Int,

    val SubMessung_image: Blob?,

    val SubMessung_wasserstand: Double?,

    val SubMessung_datetime: Timestamp?,

    val SubMessung_herkunft: String?,

    val fk_SubZaehler_id: Int
)

@Entity
@Table(name = "SubZaehler_tabel")
data class SubZaehlerTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val SubZaehler_id: Int,

    val SubZaehler_position: String?,

    val fk_Zaehler_id: Int
)

@Entity
@Table(name = "Wasseranschluss")
data class Wasseranschluss(
    @Id
    val AnschlussID: Int,

    val WasserwerkID: Int?,

    val AdresseID: Int?,

    val KundenID: Int?
)

@Entity
@Table(name = "Wasserwerk")
data class Wasserwerk(
    @Id
    val WasserwerkID: Int,

    val AdresseID: Int?
)

@Entity
@Table(name = "Wasserwerk_tabel")
data class WasserwerkTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Wasserwerk_id: Int,

    val Wasserwerk_name: String?
)

@Entity
@Table(name = "Zaehler_tabel")
data class ZaehlerTabel(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val Zaehler_id: Int,

    val Zaehler_adresse: String?,

    val fk_Wasserwerk_id: Int,

    val fk_Kunden_id: Int
)

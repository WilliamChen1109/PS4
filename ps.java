package com.sonymobile.ds4;

import android.bluetooth.BluetoothDevice;
import android.os.Binder;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import com.sonymobile.ds4.IHidSonyDS4Callback;
import java.util.List;
import o.C0233;
import o.C0253;

public interface IHidSonyDS4Service extends IInterface {
    /* renamed from: ˊ  reason: contains not printable characters */
    List<C0253> m1819(BluetoothDevice bluetoothDevice);

    /* renamed from: ˊ  reason: contains not printable characters */
    boolean m1820(BluetoothDevice bluetoothDevice, int i, int i2);

    /* renamed from: ˊ  reason: contains not printable characters */
    boolean m1821(BluetoothDevice bluetoothDevice, boolean z);

    /* renamed from: ˋ  reason: contains not printable characters */
    void m1822(IHidSonyDS4Callback iHidSonyDS4Callback);

    /* renamed from: ˋ  reason: contains not printable characters */
    boolean m1823(int i);

    /* renamed from: ˋ  reason: contains not printable characters */
    boolean m1824(BluetoothDevice bluetoothDevice);

    /* renamed from: ˋ  reason: contains not printable characters */
    boolean m1825(BluetoothDevice bluetoothDevice, int i, int i2, int i3);

    /* renamed from: ˎ  reason: contains not printable characters */
    int m1826(int i);

    /* renamed from: ˎ  reason: contains not printable characters */
    int m1827(BluetoothDevice bluetoothDevice);

    /* renamed from: ˎ  reason: contains not printable characters */
    boolean m1828(BluetoothDevice bluetoothDevice, int i);

    /* renamed from: ˏ  reason: contains not printable characters */
    int m1829(int i);

    /* renamed from: ˏ  reason: contains not printable characters */
    List<C0233> m1830(BluetoothDevice bluetoothDevice);

    /* renamed from: ˏ  reason: contains not printable characters */
    boolean m1831(BluetoothDevice bluetoothDevice, int i, int i2);

    /* renamed from: ˏ  reason: contains not printable characters */
    boolean m1832(BluetoothDevice bluetoothDevice, boolean z);

    /* renamed from: ॱ  reason: contains not printable characters */
    BluetoothDevice m1833(int i);

    /* renamed from: ॱ  reason: contains not printable characters */
    void m1834(IHidSonyDS4Callback iHidSonyDS4Callback);

    /* renamed from: ॱ  reason: contains not printable characters */
    boolean m1835(BluetoothDevice bluetoothDevice);

    public static abstract class Stub extends Binder implements IHidSonyDS4Service {
        public Stub() {
            attachInterface(this, "com.sonymobile.ds4.IHidSonyDS4Service");
        }

        /* renamed from: ˊ  reason: contains not printable characters */
        public static IHidSonyDS4Service m1836(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.sonymobile.ds4.IHidSonyDS4Service");
            if (queryLocalInterface == null || !(queryLocalInterface instanceof IHidSonyDS4Service)) {
                return new Proxy(iBinder);
            }
            return (IHidSonyDS4Service) queryLocalInterface;
        }

        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) {
            boolean z;
            boolean z2;
            BluetoothDevice bluetoothDevice = null;
            int i3 = 0;
            switch (i) {
                case 1:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    m1822(IHidSonyDS4Callback.Stub.m1816(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 2:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    m1834(IHidSonyDS4Callback.Stub.m1816(parcel.readStrongBinder()));
                    parcel2.writeNoException();
                    return true;
                case 3:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    boolean r0 = m1820(bluetoothDevice, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(r0 ? 1 : 0);
                    return true;
                case 4:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    boolean r02 = m1825(bluetoothDevice, parcel.readInt(), parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (r02) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 5:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    boolean r03 = m1831(bluetoothDevice, parcel.readInt(), parcel.readInt());
                    parcel2.writeNoException();
                    if (r03) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 6:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    boolean r04 = m1835(bluetoothDevice);
                    parcel2.writeNoException();
                    if (r04) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 7:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        z2 = true;
                    } else {
                        z2 = false;
                    }
                    boolean r05 = m1832(bluetoothDevice, z2);
                    parcel2.writeNoException();
                    if (r05) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 8:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    if (parcel.readInt() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    boolean r06 = m1821(bluetoothDevice, z);
                    parcel2.writeNoException();
                    if (r06) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 9:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    List<C0253> r07 = m1819(bluetoothDevice);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(r07);
                    return true;
                case 10:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    List<C0233> r08 = m1830(bluetoothDevice);
                    parcel2.writeNoException();
                    parcel2.writeTypedList(r08);
                    return true;
                case 11:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    boolean r09 = m1828(bluetoothDevice, parcel.readInt());
                    parcel2.writeNoException();
                    if (r09) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 12:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    boolean r010 = m1824(bluetoothDevice);
                    parcel2.writeNoException();
                    if (r010) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 13:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    boolean r011 = m1823(parcel.readInt());
                    parcel2.writeNoException();
                    if (r011) {
                        i3 = 1;
                    }
                    parcel2.writeInt(i3);
                    return true;
                case 14:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (parcel.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(parcel);
                    }
                    int r012 = m1827(bluetoothDevice);
                    parcel2.writeNoException();
                    parcel2.writeInt(r012);
                    return true;
                case 15:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    int r013 = m1826(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(r013);
                    return true;
                case 16:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    BluetoothDevice r014 = m1833(parcel.readInt());
                    parcel2.writeNoException();
                    if (r014 != null) {
                        parcel2.writeInt(1);
                        r014.writeToParcel(parcel2, 1);
                        return true;
                    }
                    parcel2.writeInt(0);
                    return true;
                case 17:
                    parcel.enforceInterface("com.sonymobile.ds4.IHidSonyDS4Service");
                    int r015 = m1829(parcel.readInt());
                    parcel2.writeNoException();
                    parcel2.writeInt(r015);
                    return true;
                case 1598968902:
                    parcel2.writeString("com.sonymobile.ds4.IHidSonyDS4Service");
                    return true;
                default:
                    return super.onTransact(i, parcel, parcel2, i2);
            }
        }

        static class Proxy implements IHidSonyDS4Service {

            /* renamed from: ˋ  reason: contains not printable characters */
            private IBinder f1219;

            Proxy(IBinder iBinder) {
                this.f1219 = iBinder;
            }

            public IBinder asBinder() {
                return this.f1219;
            }

            /* renamed from: ˋ  reason: contains not printable characters */
            public final void m1840(IHidSonyDS4Callback iHidSonyDS4Callback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    obtain.writeStrongBinder(iHidSonyDS4Callback != null ? iHidSonyDS4Callback.asBinder() : null);
                    this.f1219.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ॱ  reason: contains not printable characters */
            public final void m1852(IHidSonyDS4Callback iHidSonyDS4Callback) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    obtain.writeStrongBinder(iHidSonyDS4Callback != null ? iHidSonyDS4Callback.asBinder() : null);
                    this.f1219.transact(2, obtain, obtain2, 0);
                    obtain2.readException();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˊ  reason: contains not printable characters */
            public final boolean m1838(BluetoothDevice bluetoothDevice, int i, int i2) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f1219.transact(3, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˋ  reason: contains not printable characters */
            public final boolean m1843(BluetoothDevice bluetoothDevice, int i, int i2, int i3) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    obtain.writeInt(i3);
                    this.f1219.transact(4, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˏ  reason: contains not printable characters */
            public final boolean m1849(BluetoothDevice bluetoothDevice, int i, int i2) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    obtain.writeInt(i2);
                    this.f1219.transact(5, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ॱ  reason: contains not printable characters */
            public final boolean m1853(BluetoothDevice bluetoothDevice) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1219.transact(6, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˏ  reason: contains not printable characters */
            public final boolean m1850(BluetoothDevice bluetoothDevice, boolean z) {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    this.f1219.transact(7, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˊ  reason: contains not printable characters */
            public final boolean m1839(BluetoothDevice bluetoothDevice, boolean z) {
                boolean z2 = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(z ? 1 : 0);
                    this.f1219.transact(8, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z2 = false;
                    }
                    return z2;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˊ  reason: contains not printable characters */
            public final List<C0253> m1837(BluetoothDevice bluetoothDevice) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1219.transact(9, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(C0253.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˏ  reason: contains not printable characters */
            public final List<C0233> m1848(BluetoothDevice bluetoothDevice) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1219.transact(10, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.createTypedArrayList(C0233.CREATOR);
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˎ  reason: contains not printable characters */
            public final boolean m1846(BluetoothDevice bluetoothDevice, int i) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    obtain.writeInt(i);
                    this.f1219.transact(11, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˋ  reason: contains not printable characters */
            public final boolean m1842(BluetoothDevice bluetoothDevice) {
                boolean z = true;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1219.transact(12, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() == 0) {
                        z = false;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˋ  reason: contains not printable characters */
            public final boolean m1841(int i) {
                boolean z = false;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    obtain.writeInt(i);
                    this.f1219.transact(13, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        z = true;
                    }
                    return z;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˎ  reason: contains not printable characters */
            public final int m1845(BluetoothDevice bluetoothDevice) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    if (bluetoothDevice != null) {
                        obtain.writeInt(1);
                        bluetoothDevice.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.f1219.transact(14, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˎ  reason: contains not printable characters */
            public final int m1844(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    obtain.writeInt(i);
                    this.f1219.transact(15, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ॱ  reason: contains not printable characters */
            public final BluetoothDevice m1851(int i) {
                BluetoothDevice bluetoothDevice;
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    obtain.writeInt(i);
                    this.f1219.transact(16, obtain, obtain2, 0);
                    obtain2.readException();
                    if (obtain2.readInt() != 0) {
                        bluetoothDevice = (BluetoothDevice) BluetoothDevice.CREATOR.createFromParcel(obtain2);
                    } else {
                        bluetoothDevice = null;
                    }
                    return bluetoothDevice;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }

            /* renamed from: ˏ  reason: contains not printable characters */
            public final int m1847(int i) {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.sonymobile.ds4.IHidSonyDS4Service");
                    obtain.writeInt(i);
                    this.f1219.transact(17, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}

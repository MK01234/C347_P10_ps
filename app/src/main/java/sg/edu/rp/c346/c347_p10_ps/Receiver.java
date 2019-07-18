package sg.edu.rp.c346.c347_p10_ps;

import android.app.Activity;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;

public class Receiver extends BroadcastReceiver {
    public void onReceive(Context context, Intent intent) {
        Intent intent1 = new Intent(context, MainActivity.class);
        PendingIntent pIntent = PendingIntent.getActivity(context, 1, intent1, PendingIntent.FLAG_CANCEL_CURRENT);
        Notification n = new Notification.Builder(context)
                .setContentText("Continue on with your reading!")
                .setContentIntent(pIntent)
                .setAutoCancel(true)
                .build();
        NotificationManager nm = (NotificationManager) context.getSystemService(Activity.NOTIFICATION_SERVICE);
        nm.notify(1, n);
    }
}

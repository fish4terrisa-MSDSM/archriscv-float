package fish4terrisa.archlinux.float;

import android.app.Activity;
import android.content.Intent;

/**
 * Simple activity which immediately launches {@link TermuxFloatService} and exits.
 */
public class TermuxFloatActivity extends Activity {

    @Override
    protected void onResume() {
        super.onResume();
        startService(new Intent(this, TermuxFloatService.class));
        finish();
    }
}

package com.ozkuran.algorithms.data.acquisition.mailbox.mbox;

import java.io.*;
import java.util.HashSet;
import java.util.Iterator;

/**
 * @version 0.0.1
 * Created by MahmutAli on 2/23/2015.
 * Last Update by MahmutAli on 2/24/2015.
 * Class for processing MBOX files of Mailboxes
 * References : [RFC4155] http://tools.ietf.org/pdf/rfc4155.pdf
 * References : [RFC2822] http://tools.ietf.org/pdf/rfc2822.pdf
 * References : [RFC822] http://tools.ietf.org/pdf/rfc822.pdf
 * References : [RFC733] http://tools.ietf.org/pdf/rfc733.pdf
 */
public class MBox {
    private String _filename;

    /// <summary>
    /// Constructor
    /// </summary>
    /// <param name="filename"></param>
    public MBox(String filename)
    {
        _filename = filename;
    }

    public void ProcessMbox() throws IOException {
        HashSet<String> distinctValues = new HashSet();
        String line;

        if (_filename == "")
        {
            _filename = String.format("d:\\data\\comp.database.oracle.mbox");
            BufferedReader br = new BufferedReader(new FileReader(_filename));
            while ((line = br.readLine()) != null)
            {
                int index = line.indexOf(": ");
                if ((index >= 2) && (index < 30))
                {
                    distinctValues.add(line.substring(0, index - 1));
                }
            }
            _filename = "";
        }
    }
}

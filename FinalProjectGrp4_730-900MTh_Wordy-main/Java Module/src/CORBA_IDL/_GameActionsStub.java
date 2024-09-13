package CORBA_IDL;


/**
* CORBA_IDL/_GameActionsStub.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from GameActions.idl
* Tuesday, May 9, 2023 9:47:20 AM CST
*/

public class _GameActionsStub extends org.omg.CORBA.portable.ObjectImpl implements CORBA_IDL.GameActions
{

  public void login (String username, String password) throws CORBA_IDL.UserNotFoundException, CORBA_IDL.WrongCredentials, CORBA_IDL.UserOnlineException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("login", true);
                $out.write_string (username);
                $out.write_string (password);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:CORBA_IDL/UserNotFoundException:1.0"))
                    throw CORBA_IDL.UserNotFoundExceptionHelper.read ($in);
                else if (_id.equals ("IDL:CORBA_IDL/WrongCredentials:1.0"))
                    throw CORBA_IDL.WrongCredentialsHelper.read ($in);
                else if (_id.equals ("IDL:CORBA_IDL/UserOnlineException:1.0"))
                    throw CORBA_IDL.UserOnlineExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                login (username, password        );
            } finally {
                _releaseReply ($in);
            }
  } // login

  public int joinGame (String username)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("joinGame", true);
                $out.write_string (username);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return joinGame (username        );
            } finally {
                _releaseReply ($in);
            }
  } // joinGame

  public int getTimer (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getTimer", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getTimer (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // getTimer

  public String[] getGamePlayers (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getGamePlayers", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                String $result[] = CORBA_IDL.wordsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getGamePlayers (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // getGamePlayers

  public void initializeGame (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("initializeGame", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                initializeGame (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // initializeGame

  public boolean runGame (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("runGame", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                boolean $result = $in.read_boolean ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return runGame (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // runGame

  public void sendWord (int gameID, String username, String word) throws CORBA_IDL.NoWordException, CORBA_IDL.ShortWordException, CORBA_IDL.WordRepeatedException, CORBA_IDL.InvalidWordException
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("sendWord", true);
                $out.write_long (gameID);
                $out.write_string (username);
                $out.write_string (word);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                if (_id.equals ("IDL:CORBA_IDL/NoWordException:1.0"))
                    throw CORBA_IDL.NoWordExceptionHelper.read ($in);
                else if (_id.equals ("IDL:CORBA_IDL/ShortWordException:1.0"))
                    throw CORBA_IDL.ShortWordExceptionHelper.read ($in);
                else if (_id.equals ("IDL:CORBA_IDL/WordRepeatedException:1.0"))
                    throw CORBA_IDL.WordRepeatedExceptionHelper.read ($in);
                else if (_id.equals ("IDL:CORBA_IDL/InvalidWordException:1.0"))
                    throw CORBA_IDL.InvalidWordExceptionHelper.read ($in);
                else
                    throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                sendWord (gameID, username, word        );
            } finally {
                _releaseReply ($in);
            }
  } // sendWord

  public char[] getCharacters (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getCharacters", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                char $result[] = CORBA_IDL.charListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getCharacters (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // getCharacters

  public String[] getEnteredWords (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getEnteredWords", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                String $result[] = CORBA_IDL.wordsHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getEnteredWords (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // getEnteredWords

  public String getRoundWinner (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getRoundWinner", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getRoundWinner (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // getRoundWinner

  public String getGameWinner (int gameID)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getGameWinner", true);
                $out.write_long (gameID);
                $in = _invoke ($out);
                String $result = $in.read_string ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getGameWinner (gameID        );
            } finally {
                _releaseReply ($in);
            }
  } // getGameWinner

  public int getNoWinInGame (int gameID, String username)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getNoWinInGame", true);
                $out.write_long (gameID);
                $out.write_string (username);
                $in = _invoke ($out);
                int $result = $in.read_long ();
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getNoWinInGame (gameID, username        );
            } finally {
                _releaseReply ($in);
            }
  } // getNoWinInGame

  public String[][] getLeaderboardWinList ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLeaderboardWinList", true);
                $in = _invoke ($out);
                String $result[][] = CORBA_IDL.leaderboardListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLeaderboardWinList (        );
            } finally {
                _releaseReply ($in);
            }
  } // getLeaderboardWinList

  public String[][] getLeaderBoardLongestWordsList ()
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("getLeaderBoardLongestWordsList", true);
                $in = _invoke ($out);
                String $result[][] = CORBA_IDL.leaderboardListHelper.read ($in);
                return $result;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                return getLeaderBoardLongestWordsList (        );
            } finally {
                _releaseReply ($in);
            }
  } // getLeaderBoardLongestWordsList

  public void quitGame (int gameID, String username)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("quitGame", true);
                $out.write_long (gameID);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                quitGame (gameID, username        );
            } finally {
                _releaseReply ($in);
            }
  } // quitGame

  public void logout (String username)
  {
            org.omg.CORBA.portable.InputStream $in = null;
            try {
                org.omg.CORBA.portable.OutputStream $out = _request ("logout", true);
                $out.write_string (username);
                $in = _invoke ($out);
                return;
            } catch (org.omg.CORBA.portable.ApplicationException $ex) {
                $in = $ex.getInputStream ();
                String _id = $ex.getId ();
                throw new org.omg.CORBA.MARSHAL (_id);
            } catch (org.omg.CORBA.portable.RemarshalException $rm) {
                logout (username        );
            } finally {
                _releaseReply ($in);
            }
  } // logout

  // Type-specific CORBA::Object operations
  private static String[] __ids = {
    "IDL:CORBA_IDL/GameActions:1.0"};

  public String[] _ids ()
  {
    return (String[])__ids.clone ();
  }

  private void readObject (java.io.ObjectInputStream s) throws java.io.IOException
  {
     String str = s.readUTF ();
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     org.omg.CORBA.Object obj = orb.string_to_object (str);
     org.omg.CORBA.portable.Delegate delegate = ((org.omg.CORBA.portable.ObjectImpl) obj)._get_delegate ();
     _set_delegate (delegate);
   } finally {
     orb.destroy() ;
   }
  }

  private void writeObject (java.io.ObjectOutputStream s) throws java.io.IOException
  {
     String[] args = null;
     java.util.Properties props = null;
     org.omg.CORBA.ORB orb = org.omg.CORBA.ORB.init (args, props);
   try {
     String str = orb.object_to_string (this);
     s.writeUTF (str);
   } finally {
     orb.destroy() ;
   }
  }
} // class _GameActionsStub
